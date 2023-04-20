package eu.chargetime.ocpp.features.client.handlers;

import eu.chargetime.ocpp.model.request.SendLocalListRequest;
import eu.chargetime.ocpp.model.request.SetDisplayMessageRequest;
import eu.chargetime.ocpp.model.response.SetDisplayMessageResponse;

/** Charging Station handler of {@link SendLocalListRequest} */
public interface IClientSetDisplayMessageRequestHandler {
    SetDisplayMessageResponse handleSetDisplayMessageRequest(SetDisplayMessageRequest request);
}
