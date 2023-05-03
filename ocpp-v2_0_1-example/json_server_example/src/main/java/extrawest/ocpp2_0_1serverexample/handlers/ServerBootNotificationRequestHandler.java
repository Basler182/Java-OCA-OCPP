package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerBootNotificationRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.RegistrationStatusEnumType;
import extrawest.ocpp.model.request.BootNotificationRequest;
import extrawest.ocpp.model.response.BootNotificationResponse;

import java.time.LocalDateTime;
import java.util.UUID;

public class ServerBootNotificationRequestHandler implements IServerBootNotificationRequestHandler {
    @Override
    public BootNotificationResponse handleBootNotificationRequest(UUID sessionIndex, BootNotificationRequest request) {
        return new BootNotificationResponse(LocalDateTime.now(), 10, RegistrationStatusEnumType.ACCEPTED);
    }
}
