package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerNotifyChargingLimitRequestHandler;
import extrawest.ocpp.model.request.NotifyChargingLimitRequest;
import extrawest.ocpp.model.response.NotifyChargingLimitResponse;

import java.util.UUID;

public class ServerNotifyChargingLimitRequestHandler implements IServerNotifyChargingLimitRequestHandler {
    @Override
    public NotifyChargingLimitResponse handleNotifyChargingLimitRequest(UUID sessionIndex, NotifyChargingLimitRequest request) {
        return new NotifyChargingLimitResponse();
    }
}
