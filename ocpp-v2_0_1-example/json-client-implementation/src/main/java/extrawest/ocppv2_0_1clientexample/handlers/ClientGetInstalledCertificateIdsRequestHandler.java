package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientGetInstalledCertificateIdsRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.GetInstalledCertificateStatusEnumType;
import extrawest.ocpp.model.request.GetInstalledCertificateIdsRequest;
import extrawest.ocpp.model.response.GetInstalledCertificateIdsResponse;

public class ClientGetInstalledCertificateIdsRequestHandler implements IClientGetInstalledCertificateIdsRequestHandler {
    @Override
    public GetInstalledCertificateIdsResponse handleGetInstalledCertificateIdsRequest(GetInstalledCertificateIdsRequest request) {
        System.out.println(request.toString());
        return new GetInstalledCertificateIdsResponse(GetInstalledCertificateStatusEnumType.ACCEPTED);
    }
}
