package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientTriggerMessageRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.TriggerMessageStatusEnumType;
import extrawest.ocpp.model.request.TriggerMessageRequest;
import extrawest.ocpp.model.response.TriggerMessageResponse;

public class ClientTriggerMessageRequestHandler implements IClientTriggerMessageRequestHandler {
    @Override
    public TriggerMessageResponse handleTriggerMessageRequest(TriggerMessageRequest request) {
        System.out.println(request.toString());
        return new TriggerMessageResponse(TriggerMessageStatusEnumType.ACCEPTED);
    }
}
