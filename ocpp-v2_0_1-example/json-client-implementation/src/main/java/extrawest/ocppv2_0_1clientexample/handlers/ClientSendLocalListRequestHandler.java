package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientSendLocalListRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.SendLocalListStatusEnumType;
import extrawest.ocpp.model.request.SendLocalListRequest;
import extrawest.ocpp.model.response.SendLocalListResponse;

public class ClientSendLocalListRequestHandler implements IClientSendLocalListRequestHandler {
    @Override
    public SendLocalListResponse handleSendLocalListRequest(SendLocalListRequest request) {
        System.out.println(request.toString());
        return new SendLocalListResponse(SendLocalListStatusEnumType.ACCEPTED);
    }
}
