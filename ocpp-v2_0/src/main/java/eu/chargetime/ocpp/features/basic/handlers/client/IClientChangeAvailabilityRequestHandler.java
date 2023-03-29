package eu.chargetime.ocpp.features.basic.handlers.client;

import eu.chargetime.ocpp.model.request.ChangeAvailabilityRequest;
import eu.chargetime.ocpp.model.response.ChangeAvailabilityResponse;

/** Charging Station handler of {@link ChangeAvailabilityRequest} */
public interface IClientChangeAvailabilityRequestHandler {
    ChangeAvailabilityResponse handleGetVariablesRequest(ChangeAvailabilityRequest request);
}
