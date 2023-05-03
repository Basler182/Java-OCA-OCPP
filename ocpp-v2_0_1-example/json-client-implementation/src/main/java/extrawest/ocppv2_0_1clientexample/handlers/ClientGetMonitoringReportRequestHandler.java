package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientGetMonitoringReportRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.GenericDeviceModelStatusEnumType;
import extrawest.ocpp.model.request.GetMonitoringReportRequest;
import extrawest.ocpp.model.response.GetMonitoringReportResponse;

public class ClientGetMonitoringReportRequestHandler implements IClientGetMonitoringReportRequestHandler {
    @Override
    public GetMonitoringReportResponse handleGetMonitoringReportRequest(GetMonitoringReportRequest request) {
        System.out.println(request.toString());
        return new GetMonitoringReportResponse(GenericDeviceModelStatusEnumType.ACCEPTED);
    }
}
