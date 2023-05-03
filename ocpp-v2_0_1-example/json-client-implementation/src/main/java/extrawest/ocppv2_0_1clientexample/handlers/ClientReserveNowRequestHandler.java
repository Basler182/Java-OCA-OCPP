package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientReserveNowRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.ReserveNowStatusEnumType;
import extrawest.ocpp.model.request.ReserveNowRequest;
import extrawest.ocpp.model.response.ReserveNowResponse;

public class ClientReserveNowRequestHandler implements IClientReserveNowRequestHandler {
    @Override
    public ReserveNowResponse handleReserveNowRequest(ReserveNowRequest request) {
        System.out.println(request.toString());
        return new ReserveNowResponse(ReserveNowStatusEnumType.ACCEPTED);
    }
}
