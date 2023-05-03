package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerPublishFirmwareStatusNotificationRequestHandler;
import extrawest.ocpp.model.request.PublishFirmwareStatusNotificationRequest;
import extrawest.ocpp.model.response.PublishFirmwareStatusNotificationResponse;

import java.util.UUID;

public class ServerPublishFirmwareStatusNotificationRequestHandler implements IServerPublishFirmwareStatusNotificationRequestHandler {
    @Override
    public PublishFirmwareStatusNotificationResponse handlePublishFirmwareStatusNotificationRequest(UUID sessionIndex, PublishFirmwareStatusNotificationRequest request) {
        return new PublishFirmwareStatusNotificationResponse();
    }
}
