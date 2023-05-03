package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientGetLogRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.LogStatusEnumType;
import extrawest.ocpp.model.request.GetLogRequest;
import extrawest.ocpp.model.response.GetLogResponse;

public class ClientGetLogRequestHandler implements IClientGetLogRequestHandler {
    @Override
    public GetLogResponse handleGetLogRequest(GetLogRequest request) {
        System.out.println(request.toString());
        return new GetLogResponse(LogStatusEnumType.ACCEPTED);
    }
}
