package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientSetChargingProfileRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.ChargingProfileStatusEnumType;
import extrawest.ocpp.model.request.SetChargingProfileRequest;
import extrawest.ocpp.model.response.SetChargingProfileResponse;

public class ClientSetChargingProfileRequestHandler implements IClientSetChargingProfileRequestHandler {
    @Override
    public SetChargingProfileResponse handleSetChargingProfileRequest(SetChargingProfileRequest request) {
        System.out.println(request.toString());
        return new SetChargingProfileResponse(ChargingProfileStatusEnumType.ACCEPTED);
    }
}
