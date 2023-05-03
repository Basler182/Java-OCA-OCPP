package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientSetNetworkProfileRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.SetNetworkProfileStatusEnumType;
import extrawest.ocpp.model.request.SetNetworkProfileRequest;
import extrawest.ocpp.model.response.SetNetworkProfileResponse;

public class ClientSetNetworkProfileRequestHandler implements IClientSetNetworkProfileRequestHandler {
    @Override
    public SetNetworkProfileResponse handleSetNetworkProfileRequest(SetNetworkProfileRequest request) {
        System.out.println(request.toString());
        return new SetNetworkProfileResponse(SetNetworkProfileStatusEnumType.ACCEPTED);
    }
}
