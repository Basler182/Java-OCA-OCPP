package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerNotifyCustomerInformationRequestHandler;
import extrawest.ocpp.model.request.NotifyCustomerInformationRequest;
import extrawest.ocpp.model.response.NotifyCustomerInformationResponse;

import java.util.UUID;

public class ServerNotifyCustomerInformationRequestHandler implements IServerNotifyCustomerInformationRequestHandler {
    @Override
    public NotifyCustomerInformationResponse handleNotifyCustomerInformationRequest(UUID sessionIndex, NotifyCustomerInformationRequest request) {
        return new NotifyCustomerInformationResponse();
    }
}
