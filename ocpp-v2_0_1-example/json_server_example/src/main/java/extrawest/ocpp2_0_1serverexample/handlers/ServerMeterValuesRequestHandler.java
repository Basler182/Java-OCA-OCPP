package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerMeterValuesRequestHandler;
import extrawest.ocpp.model.request.MeterValuesRequest;
import extrawest.ocpp.model.response.MeterValuesResponse;

import java.util.UUID;

public class ServerMeterValuesRequestHandler implements IServerMeterValuesRequestHandler {
    @Override
    public MeterValuesResponse handleMeterValuesRequest(UUID sessionIndex, MeterValuesRequest request) {
        return new MeterValuesResponse();
    }
}
