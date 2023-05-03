package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientClearVariableMonitoringRequestHandler;
import extrawest.ocpp.model.dataTypes.ClearMonitoringResultType;
import extrawest.ocpp.model.dataTypes.enums.ClearMonitoringStatusEnumType;
import extrawest.ocpp.model.request.ClearVariableMonitoringRequest;
import extrawest.ocpp.model.response.ClearVariableMonitoringResponse;

import java.util.ArrayList;
import java.util.List;

public class ClientClearVariableMonitoringRequestHandler implements IClientClearVariableMonitoringRequestHandler {
    @Override
    public ClearVariableMonitoringResponse handleClearVariableMonitoringRequest(ClearVariableMonitoringRequest request) {
        System.out.println(request.toString());
        List<ClearMonitoringResultType> clearMonitoringResultTypes = new ArrayList<>();
        clearMonitoringResultTypes.add(new ClearMonitoringResultType(ClearMonitoringStatusEnumType.ACCEPTED, 1));
        return new ClearVariableMonitoringResponse(clearMonitoringResultTypes);
    }
}
