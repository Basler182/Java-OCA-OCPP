package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientClearDisplayMessageRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.ClearMessageStatusEnumType;
import extrawest.ocpp.model.request.ClearDisplayMessageRequest;
import extrawest.ocpp.model.response.ClearDisplayMessageResponse;

public class ClientClearDisplayMessageRequestHandler implements IClientClearDisplayMessageRequestHandler {
    @Override
    public ClearDisplayMessageResponse handleClearDisplayMessageRequest(ClearDisplayMessageRequest request) {
        System.out.println(request.toString());
        return new ClearDisplayMessageResponse(ClearMessageStatusEnumType.ACCEPTED);
    }
}
