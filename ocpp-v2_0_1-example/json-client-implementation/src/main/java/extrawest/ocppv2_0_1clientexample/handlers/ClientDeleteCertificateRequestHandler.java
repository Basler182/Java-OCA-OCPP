package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientDeleteCertificateRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.DeleteCertificateStatusEnumType;
import extrawest.ocpp.model.request.DeleteCertificateRequest;
import extrawest.ocpp.model.response.DeleteCertificateResponse;

public class ClientDeleteCertificateRequestHandler implements IClientDeleteCertificateRequestHandler {
    @Override
    public DeleteCertificateResponse handleCancelDeleteCertificateRequest(DeleteCertificateRequest request) {
        System.out.println(request.toString());
        return new DeleteCertificateResponse(DeleteCertificateStatusEnumType.ACCEPTED);
    }
}
