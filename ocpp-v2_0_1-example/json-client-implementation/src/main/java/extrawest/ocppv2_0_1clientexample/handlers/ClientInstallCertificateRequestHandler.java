package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientInstallCertificateRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.InstallCertificateStatusEnumType;
import extrawest.ocpp.model.request.InstallCertificateRequest;
import extrawest.ocpp.model.response.InstallCertificateResponse;

public class ClientInstallCertificateRequestHandler implements IClientInstallCertificateRequestHandler {
    @Override
    public InstallCertificateResponse handleInstallCertificateRequest(InstallCertificateRequest request) {
        System.out.println(request.toString());
        return new InstallCertificateResponse(InstallCertificateStatusEnumType.ACCEPTED);
    }
}
