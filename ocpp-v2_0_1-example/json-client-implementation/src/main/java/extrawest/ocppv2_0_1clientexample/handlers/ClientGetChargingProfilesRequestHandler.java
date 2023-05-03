package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientGetChargingProfilesRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.GetChargingProfileStatusEnumType;
import extrawest.ocpp.model.request.GetChargingProfilesRequest;
import extrawest.ocpp.model.response.GetChargingProfilesResponse;

public class ClientGetChargingProfilesRequestHandler implements IClientGetChargingProfilesRequestHandler {
    @Override
    public GetChargingProfilesResponse handleGetChargingProfilesRequest(GetChargingProfilesRequest request) {
        System.out.println(request.toString());
        return new GetChargingProfilesResponse(GetChargingProfileStatusEnumType.ACCEPTED);
    }
}
