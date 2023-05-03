package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientGetDisplayMessagesRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.GetDisplayMessagesStatusEnumType;
import extrawest.ocpp.model.request.GetDisplayMessagesRequest;
import extrawest.ocpp.model.response.GetDisplayMessagesResponse;

public class ClientGetDisplayMessagesRequestHandler implements IClientGetDisplayMessagesRequestHandler {
    @Override
    public GetDisplayMessagesResponse handleGetDisplayMessagesRequest(GetDisplayMessagesRequest request) {
        System.out.println(request.toString());
        return new GetDisplayMessagesResponse(GetDisplayMessagesStatusEnumType.ACCEPTED);
    }
}
