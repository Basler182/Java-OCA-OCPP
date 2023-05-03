package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientRequestStopTransactionRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.RequestStartStopStatusEnumType;
import extrawest.ocpp.model.request.RequestStopTransactionRequest;
import extrawest.ocpp.model.response.RequestStopTransactionResponse;

public class ClientRequestStopTransactionRequestHandler implements IClientRequestStopTransactionRequestHandler {
    @Override
    public RequestStopTransactionResponse handleRequestStopTransactionRequest(RequestStopTransactionRequest request) {
        System.out.println(request.toString());
        return new RequestStopTransactionResponse(RequestStartStopStatusEnumType.ACCEPTED);
    }
}
