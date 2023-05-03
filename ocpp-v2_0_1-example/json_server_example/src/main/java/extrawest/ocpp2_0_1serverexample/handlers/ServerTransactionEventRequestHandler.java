package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerTransactionEventRequestHandler;
import extrawest.ocpp.model.request.TransactionEventRequest;
import extrawest.ocpp.model.response.TransactionEventResponse;

import java.util.UUID;

public class ServerTransactionEventRequestHandler implements IServerTransactionEventRequestHandler {
    @Override
    public TransactionEventResponse handleTransactionEventRequest(UUID sessionIndex, TransactionEventRequest request) {
        return new TransactionEventResponse();
    }
}
