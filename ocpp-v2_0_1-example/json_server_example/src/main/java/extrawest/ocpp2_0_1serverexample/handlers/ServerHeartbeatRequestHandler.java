package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerHeartbeatRequestHandler;
import extrawest.ocpp.model.request.HeartbeatRequest;
import extrawest.ocpp.model.response.HeartbeatResponse;

import java.time.LocalDateTime;
import java.util.UUID;

public class ServerHeartbeatRequestHandler implements IServerHeartbeatRequestHandler {
    @Override
    public HeartbeatResponse handleHeartbeatRequest(UUID sessionIndex, HeartbeatRequest request) {
        return new HeartbeatResponse(LocalDateTime.now());
    }
}
