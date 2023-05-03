package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerLogStatusNotificationRequestHandler;
import extrawest.ocpp.model.request.LogStatusNotificationRequest;
import extrawest.ocpp.model.response.LogStatusNotificationResponse;

import java.util.UUID;

public class ServerLogStatusNotificationRequestHandler implements IServerLogStatusNotificationRequestHandler {
    @Override
    public LogStatusNotificationResponse handleLogStatusNotificationRequest(UUID sessionIndex, LogStatusNotificationRequest request) {
        return new LogStatusNotificationResponse();
    }
}
