package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerNotifyDisplayMessagesRequestHandler;
import extrawest.ocpp.model.request.NotifyDisplayMessagesRequest;
import extrawest.ocpp.model.response.NotifyDisplayMessagesResponse;

import java.util.UUID;

public class ServerNotifyDisplayMessagesRequestHandler implements IServerNotifyDisplayMessagesRequestHandler {
    @Override
    public NotifyDisplayMessagesResponse handleNotifyDisplayMessagesRequest(UUID sessionIndex, NotifyDisplayMessagesRequest request) {
        return new NotifyDisplayMessagesResponse();
    }
}
