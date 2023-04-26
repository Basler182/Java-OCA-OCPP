package extrawest.ocpp.model.securityext.test;

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

import extrawest.ocpp.model.securityext.GetLogRequest;
import extrawest.ocpp.model.securityext.types.LogEnumType;
import extrawest.ocpp.model.securityext.types.LogParametersType;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetLogRequestTest {

  @Test
  public void validate_constructor_returnsTrue() {
    // Given
    LogEnumType logType = LogEnumType.DiagnosticsLog;
    Integer requestId = 1;
    LogParametersType log = givenLogParametersType();
    GetLogRequest request = new GetLogRequest(logType, requestId, log);

    // When
    boolean actual = request.validate();

    // Then
    assertTrue(actual);
  }

  @Test
  public void validate_setRequired_returnsTrue() {
    // Given
    LogEnumType logType = LogEnumType.DiagnosticsLog;
    Integer requestId = 1;
    LogParametersType log = givenLogParametersType();
    GetLogRequest request = new GetLogRequest(null, null, null);

    request.setLogType(logType);
    request.setRequestId(requestId);
    request.setLog(log);

    // When
    boolean actual = request.validate();

    // Then
    assertTrue(actual);
  }

  @Test
  public void validate_returnFalse() {
    // Given
    GetLogRequest request = new GetLogRequest(null, null, null);

    // When
    boolean actual = request.validate();

    // Then
    assertFalse(actual);
  }

  private LogParametersType givenLogParametersType() {
    LogParametersType logParametersType = mock(LogParametersType.class);
    when(logParametersType.validate()).thenReturn(true);
    return logParametersType;
  }
}
