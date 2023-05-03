package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientDataTransferRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.DataTransferStatusEnumType;
import extrawest.ocpp.model.request.DataTransferRequest;
import extrawest.ocpp.model.response.DataTransferResponse;

public class ClientDataTransferRequestHandler implements IClientDataTransferRequestHandler {
    @Override
    public DataTransferResponse handleCancelDataTransferRequest(DataTransferRequest request) {
        System.out.println(request.toString());
        return new DataTransferResponse(DataTransferStatusEnumType.ACCEPTED);
    }
}
