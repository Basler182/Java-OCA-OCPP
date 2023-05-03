package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerGetCertificateStatusRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.GetCertificateStatusEnumType;
import extrawest.ocpp.model.request.GetCertificateStatusRequest;
import extrawest.ocpp.model.response.GetCertificateStatusResponse;

import java.util.UUID;

public class ServerGetCertificateStatusRequestHandler implements IServerGetCertificateStatusRequestHandler {
    @Override
    public GetCertificateStatusResponse handleGetCertificateStatusRequest(UUID sessionIndex, GetCertificateStatusRequest request) {
        return new GetCertificateStatusResponse(GetCertificateStatusEnumType.ACCEPTED);
    }
}
