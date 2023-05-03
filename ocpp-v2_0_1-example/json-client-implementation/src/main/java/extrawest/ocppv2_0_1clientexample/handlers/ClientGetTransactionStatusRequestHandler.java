package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientGetTransactionStatusRequestHandler;
import extrawest.ocpp.model.request.GetTransactionStatusRequest;
import extrawest.ocpp.model.response.GetTransactionStatusResponse;

public class ClientGetTransactionStatusRequestHandler implements IClientGetTransactionStatusRequestHandler {
    @Override
    public GetTransactionStatusResponse handleGetTransactionRequest(GetTransactionStatusRequest request) {
        System.out.println(request.toString());
        return new GetTransactionStatusResponse(true);
    }
}
