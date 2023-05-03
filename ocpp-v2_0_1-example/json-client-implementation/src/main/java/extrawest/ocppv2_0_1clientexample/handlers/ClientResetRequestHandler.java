package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientResetRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.ResetStatusEnumType;
import extrawest.ocpp.model.request.ResetRequest;
import extrawest.ocpp.model.response.ResetResponse;

public class ClientResetRequestHandler implements IClientResetRequestHandler {
    @Override
    public ResetResponse handleResetRequest(ResetRequest request) {
        System.out.println(request.toString());
        return new ResetResponse(ResetStatusEnumType.ACCEPTED);
    }
}
