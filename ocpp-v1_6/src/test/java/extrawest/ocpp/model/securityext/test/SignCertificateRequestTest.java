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

import extrawest.ocpp.PropertyConstraintException;
import extrawest.ocpp.model.securityext.SignCertificateRequest;
import extrawest.ocpp.utilities.TestUtilities;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SignCertificateRequestTest {

  @Test
  public void validate_constructor_returnsTrue() {
    // Given
    String csr = givenCsr();
    SignCertificateRequest request = new SignCertificateRequest(csr);

    // When
    boolean actual = request.validate();

    // Then
    assertTrue(actual);
  }

  @Test(expected = PropertyConstraintException.class)
  public void constructor_nullCsr_throwsPropertyConstraintException() {
    // When
    new SignCertificateRequest(null);

    // Then throws
  }

  @Test
  public void setType_maximumLengthString_nothingThrown() {
    // Given
    String csr = TestUtilities.aString(5500);

    // When
    new SignCertificateRequest(csr);

    // Then nothing thrown
  }

  @Test(expected = PropertyConstraintException.class)
  public void setCsr_exceedingLengthString_throwsPropertyConstraintException() {
    // Given
    String csr = TestUtilities.aString(5501);

    // When
    new SignCertificateRequest(csr);

    // Then throws
  }

  private String givenCsr() {
    return "A Certificate Signing Request (CSR) as described in RFC 2986 and then PEM encoded";
  }
}
