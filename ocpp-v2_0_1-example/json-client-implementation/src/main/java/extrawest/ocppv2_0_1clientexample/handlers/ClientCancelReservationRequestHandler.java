package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientCancelReservationRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.CancelReservationStatusEnumType;
import extrawest.ocpp.model.request.CancelReservationRequest;
import extrawest.ocpp.model.response.CancelReservationResponse;

public class ClientCancelReservationRequestHandler implements IClientCancelReservationRequestHandler {
    @Override
    public CancelReservationResponse handleCancelReservationRequest(CancelReservationRequest request) {
        System.out.println(request.toString());
        return new CancelReservationResponse(CancelReservationStatusEnumType.ACCEPTED);
    }
}
