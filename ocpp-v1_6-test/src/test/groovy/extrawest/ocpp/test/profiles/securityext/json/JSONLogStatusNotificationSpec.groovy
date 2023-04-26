package extrawest.ocpp.test.profiles.securityext.json

/*
    ChargeTime.eu - Java-OCA-OCPP

    MIT License

    Copyright (C) 2022 Mathias Oben <mathias.oben@enervalis.com>

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
*/

import extrawest.ocpp.test.base.json.JSONBaseSpec
import extrawest.ocpp.model.securityext.types.UploadLogStatusEnumType
import spock.util.concurrent.PollingConditions

class JSONLogStatusNotificationSpec extends JSONBaseSpec {

    def "Charge point sends a LogStatusNotification request and receives a response"() {
        def conditions = new PollingConditions(timeout: 1)

        when:
        chargePoint.sendLogStatusNotificationRequest(UploadLogStatusEnumType.BadMessage)

        then:
        conditions.eventually {
            assert centralSystem.hasHandledLogStatusNotificationRequest()
        }

        then:
        conditions.eventually {
            assert chargePoint.hasReceivedLogStatusNotificationConfirmation()
        }
    }
}
