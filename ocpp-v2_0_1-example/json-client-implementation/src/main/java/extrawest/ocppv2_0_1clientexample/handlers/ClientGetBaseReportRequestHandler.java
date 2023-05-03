package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientGetBaseReportRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.GenericDeviceModelStatusEnumType;
import extrawest.ocpp.model.request.GetBaseReportRequest;
import extrawest.ocpp.model.response.GetBaseReportResponse;

public class ClientGetBaseReportRequestHandler implements IClientGetBaseReportRequestHandler {
    @Override
    public GetBaseReportResponse handleGetBaseReportRequest(GetBaseReportRequest request) {
        System.out.println(request.toString());
        return new GetBaseReportResponse(GenericDeviceModelStatusEnumType.ACCEPTED);
    }
}
