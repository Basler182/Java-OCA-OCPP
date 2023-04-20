package eu.chargetime.ocpp.features.client.handlers;

import eu.chargetime.ocpp.model.request.SendLocalListRequest;
import eu.chargetime.ocpp.model.response.SendLocalListResponse;

/** Charging Station handler of {@link SendLocalListRequest} */
public interface IClientSendLocalListRequestHandler {
    SendLocalListResponse handleSendLocalListRequest(SendLocalListRequest request);
}
