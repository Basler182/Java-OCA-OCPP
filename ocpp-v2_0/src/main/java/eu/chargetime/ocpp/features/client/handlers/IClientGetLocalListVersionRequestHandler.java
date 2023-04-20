package eu.chargetime.ocpp.features.client.handlers;

import eu.chargetime.ocpp.model.request.GetLocalListVersionRequest;
import eu.chargetime.ocpp.model.response.GetLocalListVersionResponse;

/** Charging Station handler of {@link GetLocalListVersionRequest} */
public interface IClientGetLocalListVersionRequestHandler {
    GetLocalListVersionResponse handleGetLocalListVersionRequest(GetLocalListVersionRequest request);
}
