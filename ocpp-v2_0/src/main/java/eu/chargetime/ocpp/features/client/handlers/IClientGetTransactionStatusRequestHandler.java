package eu.chargetime.ocpp.features.client.handlers;

import eu.chargetime.ocpp.model.request.GetTransactionStatusRequest;
import eu.chargetime.ocpp.model.response.GetTransactionStatusResponse;

/** Charging Station handler of {@link GetTransactionStatusRequest} */
public interface IClientGetTransactionStatusRequestHandler {
    GetTransactionStatusResponse handleGetTransactionRequest(GetTransactionStatusRequest request);
}
