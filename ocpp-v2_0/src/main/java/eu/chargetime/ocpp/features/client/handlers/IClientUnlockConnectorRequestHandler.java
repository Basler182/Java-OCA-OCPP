package eu.chargetime.ocpp.features.client.handlers;

import eu.chargetime.ocpp.model.request.UnlockConnectorRequest;
import eu.chargetime.ocpp.model.response.UnlockConnectorResponse;

/** Charging Station handler of {@link UnlockConnectorRequest} */
public interface IClientUnlockConnectorRequestHandler {
    UnlockConnectorResponse handleUnlockConnectorRequest(UnlockConnectorRequest request);
}
