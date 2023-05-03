package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerSecurityEventNotificationRequestHandler;
import extrawest.ocpp.model.request.SecurityEventNotificationRequest;
import extrawest.ocpp.model.response.SecurityEventNotificationResponse;

import java.util.UUID;

public class ServerSecurityEventNotificationRequestHandler implements IServerSecurityEventNotificationRequestHandler {
    @Override
    public SecurityEventNotificationResponse handleSecurityEventNotificationRequest(UUID sessionIndex, SecurityEventNotificationRequest request) {
        return new SecurityEventNotificationResponse();
    }
}
