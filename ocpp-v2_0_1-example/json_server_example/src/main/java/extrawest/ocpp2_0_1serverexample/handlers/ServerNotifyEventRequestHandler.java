package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerNotifyEventRequestHandler;
import extrawest.ocpp.model.request.NotifyEventRequest;
import extrawest.ocpp.model.response.NotifyEventResponse;

import java.util.UUID;

public class ServerNotifyEventRequestHandler implements IServerNotifyEventRequestHandler {
    @Override
    public NotifyEventResponse handleNotifyEventRequest(UUID sessionIndex, NotifyEventRequest request) {
        return new NotifyEventResponse();
    }
}
