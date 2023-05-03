package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientUnpublishFirmwareRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.UnpublishFirmwareStatusEnumType;
import extrawest.ocpp.model.request.UnpublishFirmwareRequest;
import extrawest.ocpp.model.response.UnpublishFirmwareResponse;

public class ClientUnpublishFirmwareRequestHandler implements IClientUnpublishFirmwareRequestHandler {
    @Override
    public UnpublishFirmwareResponse handleUnpublishFirmwareRequest(UnpublishFirmwareRequest request) {
        System.out.println(request.toString());
        return new UnpublishFirmwareResponse(UnpublishFirmwareStatusEnumType.DOWNLOAD_ONGOING);
    }
}
