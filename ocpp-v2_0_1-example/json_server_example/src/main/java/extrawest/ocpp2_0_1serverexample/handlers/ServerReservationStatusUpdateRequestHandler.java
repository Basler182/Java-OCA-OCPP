package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerReservationStatusUpdateRequestHandler;
import extrawest.ocpp.model.request.ReservationStatusUpdateRequest;
import extrawest.ocpp.model.response.ReservationStatusUpdateResponse;

import java.util.UUID;

public class ServerReservationStatusUpdateRequestHandler implements IServerReservationStatusUpdateRequestHandler {
    @Override
    public ReservationStatusUpdateResponse handleReservationStatusUpdateRequest(UUID sessionIndex, ReservationStatusUpdateRequest request) {
        return new ReservationStatusUpdateResponse();
    }
}
