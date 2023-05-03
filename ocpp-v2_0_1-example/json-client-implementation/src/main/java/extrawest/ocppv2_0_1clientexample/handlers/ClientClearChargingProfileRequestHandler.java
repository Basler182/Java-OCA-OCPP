package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientClearChargingProfileRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.ClearChargingProfileStatusEnumType;
import extrawest.ocpp.model.request.ClearChargingProfileRequest;
import extrawest.ocpp.model.response.ClearChargingProfileResponse;

public class ClientClearChargingProfileRequestHandler implements IClientClearChargingProfileRequestHandler {
    @Override
    public ClearChargingProfileResponse handleClearChargingProfileRequest(ClearChargingProfileRequest request) {
        System.out.println(request.toString());
        return new ClearChargingProfileResponse(ClearChargingProfileStatusEnumType.ACCEPTED);
    }
}
