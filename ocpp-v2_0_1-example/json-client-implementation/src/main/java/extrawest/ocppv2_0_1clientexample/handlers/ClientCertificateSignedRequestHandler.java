package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientCertificateSignedRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.CertificateSignedStatusEnumType;
import extrawest.ocpp.model.request.CertificateSignedRequest;
import extrawest.ocpp.model.response.CertificateSignedResponse;

public class ClientCertificateSignedRequestHandler implements IClientCertificateSignedRequestHandler {
    @Override
    public CertificateSignedResponse handleCertificateSignedRequest(CertificateSignedRequest request) {
        System.out.println(request.toString());
        return new CertificateSignedResponse(CertificateSignedStatusEnumType.ACCEPTED);
    }
}
