package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientGetCompositeScheduleRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.GenericStatusEnumType;
import extrawest.ocpp.model.request.GetCompositeScheduleRequest;
import extrawest.ocpp.model.response.GetCompositeScheduleResponse;

public class ClientGetCompositeScheduleRequestHandler implements IClientGetCompositeScheduleRequestHandler {
    @Override
    public GetCompositeScheduleResponse handleGetCompositeScheduleRequest(GetCompositeScheduleRequest request) {
        System.out.println(request.toString());
        return new GetCompositeScheduleResponse(GenericStatusEnumType.ACCEPTED);
    }
}
