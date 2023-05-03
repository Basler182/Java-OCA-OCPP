package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientGetLocalListVersionRequestHandler;
import extrawest.ocpp.model.request.GetLocalListVersionRequest;
import extrawest.ocpp.model.response.GetLocalListVersionResponse;

public class ClientGetLocalListVersionRequestHandler implements IClientGetLocalListVersionRequestHandler {
    @Override
    public GetLocalListVersionResponse handleGetLocalListVersionRequest(GetLocalListVersionRequest request) {
        System.out.println(request.toString());
        return new GetLocalListVersionResponse(1);
    }
}
