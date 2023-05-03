package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerGet15118EVCertificateRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.Iso15118EVCertificateStatusEnumType;
import extrawest.ocpp.model.request.Get15118EVCertificateRequest;
import extrawest.ocpp.model.response.Get15118EVCertificateResponse;

import java.util.UUID;

public class ServerGet15118EVCertificateRequestHandler implements IServerGet15118EVCertificateRequestHandler {
    @Override
    public Get15118EVCertificateResponse handleGet15118EVCertificateRequest(UUID sessionIndex, Get15118EVCertificateRequest request) {
        return new Get15118EVCertificateResponse(Iso15118EVCertificateStatusEnumType.ACCEPTED, "200");
    }
}
