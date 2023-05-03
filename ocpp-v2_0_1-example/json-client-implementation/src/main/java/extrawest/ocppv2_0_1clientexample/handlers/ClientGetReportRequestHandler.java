package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientGetReportRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.GenericDeviceModelStatusEnumType;
import extrawest.ocpp.model.request.GetReportRequest;
import extrawest.ocpp.model.response.GetReportResponse;

public class ClientGetReportRequestHandler implements IClientGetReportRequestHandler {
    @Override
    public GetReportResponse handleGetReportRequest(GetReportRequest request) {
        System.out.println(request.toString());
        return new GetReportResponse(GenericDeviceModelStatusEnumType.ACCEPTED);
    }
}
