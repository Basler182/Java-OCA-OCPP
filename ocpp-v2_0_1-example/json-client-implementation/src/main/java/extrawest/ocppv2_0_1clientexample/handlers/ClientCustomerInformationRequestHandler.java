package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientCustomerInformationRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.CustomerInformationStatusEnumType;
import extrawest.ocpp.model.request.CustomerInformationRequest;
import extrawest.ocpp.model.response.CustomerInformationResponse;

public class ClientCustomerInformationRequestHandler implements IClientCustomerInformationRequestHandler {
    @Override
    public CustomerInformationResponse handleCustomerInformationRequest(CustomerInformationRequest request) {
        System.out.println(request.toString());
        return new CustomerInformationResponse(CustomerInformationStatusEnumType.ACCEPTED);
    }
}
