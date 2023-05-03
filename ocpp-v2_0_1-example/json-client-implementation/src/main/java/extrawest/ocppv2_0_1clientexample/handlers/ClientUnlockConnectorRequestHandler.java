package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientUnlockConnectorRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.UnlockStatusEnumType;
import extrawest.ocpp.model.request.UnlockConnectorRequest;
import extrawest.ocpp.model.response.UnlockConnectorResponse;

public class ClientUnlockConnectorRequestHandler implements IClientUnlockConnectorRequestHandler {
    @Override
    public UnlockConnectorResponse handleUnlockConnectorRequest(UnlockConnectorRequest request) {
        System.out.println(request.toString());
        return new UnlockConnectorResponse(UnlockStatusEnumType.UNLOCKED);
    }
}
