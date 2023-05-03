package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientCostUpdatedRequestHandler;
import extrawest.ocpp.model.request.CostUpdatedRequest;
import extrawest.ocpp.model.response.CostUpdatedResponse;

public class ClientCostUpdatedRequestHandler implements IClientCostUpdatedRequestHandler {
    @Override
    public CostUpdatedResponse handleCostUpdatedRequest(CostUpdatedRequest request) {
        System.out.println(request.toString());
        return new CostUpdatedResponse();
    }
}
