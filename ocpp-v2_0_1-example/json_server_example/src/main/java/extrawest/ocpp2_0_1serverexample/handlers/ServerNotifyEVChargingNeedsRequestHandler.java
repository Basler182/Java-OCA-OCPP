package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerNotifyEVChargingNeedsRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.NotifyEVChargingNeedsStatusEnumType;
import extrawest.ocpp.model.request.NotifyEVChargingNeedsRequest;
import extrawest.ocpp.model.response.NotifyEVChargingNeedsResponse;

import java.util.UUID;

public class ServerNotifyEVChargingNeedsRequestHandler implements IServerNotifyEVChargingNeedsRequestHandler {
    @Override
    public NotifyEVChargingNeedsResponse handleNotifyEVChargingNeedsRequest(UUID sessionIndex, NotifyEVChargingNeedsRequest request) {
        return new NotifyEVChargingNeedsResponse(NotifyEVChargingNeedsStatusEnumType.ACCEPTED);
    }
}
