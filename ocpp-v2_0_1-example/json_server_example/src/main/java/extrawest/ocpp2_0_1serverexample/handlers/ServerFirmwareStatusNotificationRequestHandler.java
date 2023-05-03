package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerFirmwareStatusNotificationRequestHandler;
import extrawest.ocpp.model.request.FirmwareStatusNotificationRequest;
import extrawest.ocpp.model.response.FirmwareStatusNotificationResponse;

import java.util.UUID;

public class ServerFirmwareStatusNotificationRequestHandler implements IServerFirmwareStatusNotificationRequestHandler {
    @Override
    public FirmwareStatusNotificationResponse handleFirmwareStatusNotification(UUID sessionIndex, FirmwareStatusNotificationRequest request) {
        return new FirmwareStatusNotificationResponse();
    }
}
