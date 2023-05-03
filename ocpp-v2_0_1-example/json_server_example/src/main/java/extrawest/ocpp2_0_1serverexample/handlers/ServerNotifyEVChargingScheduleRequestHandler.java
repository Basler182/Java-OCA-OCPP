package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerNotifyEVChargingScheduleRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.GenericStatusEnumType;
import extrawest.ocpp.model.request.NotifyEVChargingScheduleRequest;
import extrawest.ocpp.model.response.NotifyEVChargingScheduleResponse;

import java.util.UUID;

public class ServerNotifyEVChargingScheduleRequestHandler implements IServerNotifyEVChargingScheduleRequestHandler {
    @Override
    public NotifyEVChargingScheduleResponse handleNotifyEVChargingScheduleRequest(UUID sessionIndex, NotifyEVChargingScheduleRequest request) {
        return new NotifyEVChargingScheduleResponse(GenericStatusEnumType.ACCEPTED);
    }
}
