package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientRequestStartTransactionRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.RequestStartStopStatusEnumType;
import extrawest.ocpp.model.request.RequestStartTransactionRequest;
import extrawest.ocpp.model.response.RequestStartTransactionResponse;

public class ClientRequestStartTransactionRequestHandler implements IClientRequestStartTransactionRequestHandler {
    @Override
    public RequestStartTransactionResponse handleRequestStartTransactionRequest(RequestStartTransactionRequest request) {
        System.out.println(request.toString());
        return new RequestStartTransactionResponse(RequestStartStopStatusEnumType.ACCEPTED);
    }
}
