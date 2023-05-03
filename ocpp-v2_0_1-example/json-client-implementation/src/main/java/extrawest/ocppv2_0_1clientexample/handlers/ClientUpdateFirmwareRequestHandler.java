package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientUpdateFirmwareRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.UpdateFirmwareStatusEnumType;
import extrawest.ocpp.model.request.UpdateFirmwareRequest;
import extrawest.ocpp.model.response.UpdateFirmwareResponse;

public class ClientUpdateFirmwareRequestHandler implements IClientUpdateFirmwareRequestHandler {
    @Override
    public UpdateFirmwareResponse handleUpdateFirmwareRequest(UpdateFirmwareRequest request) {
        System.out.println(request.toString());
        return new UpdateFirmwareResponse(UpdateFirmwareStatusEnumType.ACCEPTED);
    }
}
