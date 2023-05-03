package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientChangeAvailabilityRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.ChangeAvailabilityStatusEnumType;
import extrawest.ocpp.model.request.ChangeAvailabilityRequest;
import extrawest.ocpp.model.response.ChangeAvailabilityResponse;

public class ClientChangeAvailabilityRequestHandler implements IClientChangeAvailabilityRequestHandler {
    @Override
    public ChangeAvailabilityResponse handleChangeAvailabilityRequest(ChangeAvailabilityRequest request) {
        System.out.println(request.toString());
        return new ChangeAvailabilityResponse(ChangeAvailabilityStatusEnumType.ACCEPTED);
    }
}
