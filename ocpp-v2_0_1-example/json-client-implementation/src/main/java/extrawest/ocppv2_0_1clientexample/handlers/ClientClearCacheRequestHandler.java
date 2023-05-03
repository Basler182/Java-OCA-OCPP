package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientClearCacheRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.ClearCacheStatusEnumType;
import extrawest.ocpp.model.request.ClearCacheRequest;
import extrawest.ocpp.model.response.ClearCacheResponse;

public class ClientClearCacheRequestHandler implements IClientClearCacheRequestHandler {
    @Override
    public ClearCacheResponse handleClearCacheRequest(ClearCacheRequest request) {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println(request.toString());
        return new ClearCacheResponse(ClearCacheStatusEnumType.ACCEPTED);
    }
}
