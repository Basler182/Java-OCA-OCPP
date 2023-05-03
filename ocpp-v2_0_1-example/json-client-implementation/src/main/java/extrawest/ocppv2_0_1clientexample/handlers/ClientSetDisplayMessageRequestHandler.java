package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientSetDisplayMessageRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.DisplayMessageStatusEnumType;
import extrawest.ocpp.model.request.SetDisplayMessageRequest;
import extrawest.ocpp.model.response.SetDisplayMessageResponse;

public class ClientSetDisplayMessageRequestHandler implements IClientSetDisplayMessageRequestHandler {
    @Override
    public SetDisplayMessageResponse handleSetDisplayMessageRequest(SetDisplayMessageRequest request) {
        System.out.println(request.toString());
        return new SetDisplayMessageResponse(DisplayMessageStatusEnumType.ACCEPTED);
    }
}
