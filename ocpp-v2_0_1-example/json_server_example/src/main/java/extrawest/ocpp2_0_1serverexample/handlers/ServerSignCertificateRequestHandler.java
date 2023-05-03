package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerSignCertificateRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.GenericStatusEnumType;
import extrawest.ocpp.model.request.SignCertificateRequest;
import extrawest.ocpp.model.response.SignCertificateResponse;

import java.util.UUID;

public class ServerSignCertificateRequestHandler implements IServerSignCertificateRequestHandler {
    @Override
    public SignCertificateResponse handleSignCertificateRequest(UUID sessionIndex, SignCertificateRequest request) {
        return new SignCertificateResponse(GenericStatusEnumType.ACCEPTED);
    }
}
