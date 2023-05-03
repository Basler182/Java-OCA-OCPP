package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerClearedChargingLimitRequestHandler;
import extrawest.ocpp.model.request.ClearedChargingLimitRequest;
import extrawest.ocpp.model.response.ClearedChargingLimitResponse;

import java.util.UUID;

public class ServerClearedChargingLimitRequestHandler implements IServerClearedChargingLimitRequestHandler {
    @Override
    public ClearedChargingLimitResponse handleClearedChargingLimitRequest(UUID sessionIndex, ClearedChargingLimitRequest request) {
        return new ClearedChargingLimitResponse();
    }
}
