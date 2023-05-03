package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientPublishFirmwareRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.GenericStatusEnumType;
import extrawest.ocpp.model.request.PublishFirmwareRequest;
import extrawest.ocpp.model.response.PublishFirmwareResponse;

public class ClientPublishFirmwareRequestHandler implements IClientPublishFirmwareRequestHandler {
    @Override
    public PublishFirmwareResponse handlePublishFirmwareRequest(PublishFirmwareRequest request) {
        System.out.println(request.toString());
        return new PublishFirmwareResponse(GenericStatusEnumType.ACCEPTED);
    }
}
