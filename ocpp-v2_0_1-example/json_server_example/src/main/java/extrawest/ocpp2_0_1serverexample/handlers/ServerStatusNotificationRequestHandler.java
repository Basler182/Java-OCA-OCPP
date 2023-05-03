package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerStatusNotificationRequestHandler;
import extrawest.ocpp.model.request.StatusNotificationRequest;
import extrawest.ocpp.model.response.StatusNotificationResponse;

import java.util.UUID;

public class ServerStatusNotificationRequestHandler implements IServerStatusNotificationRequestHandler {
    @Override
    public StatusNotificationResponse handleStatusNotificationRequest(UUID sessionIndex, StatusNotificationRequest request) {
        return new StatusNotificationResponse();
    }
}
