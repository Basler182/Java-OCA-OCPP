package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientSetVariableMonitoringRequestHandler;
import extrawest.ocpp.model.dataTypes.ComponentType;
import extrawest.ocpp.model.dataTypes.SetMonitoringResultType;
import extrawest.ocpp.model.dataTypes.VariableType;
import extrawest.ocpp.model.dataTypes.enums.MonitorEnumType;
import extrawest.ocpp.model.dataTypes.enums.SetMonitoringStatusEnumType;
import extrawest.ocpp.model.request.SetVariableMonitoringRequest;
import extrawest.ocpp.model.response.SetVariableMonitoringResponse;

import java.util.ArrayList;
import java.util.List;

public class ClientSetVariableMonitoringRequestHandler implements IClientSetVariableMonitoringRequestHandler {
    @Override
    public SetVariableMonitoringResponse handleSetVariableMonitoringRequest(SetVariableMonitoringRequest request) {
        System.out.println(request.toString());
        List<SetMonitoringResultType> setMonitoringResultTypes = new ArrayList<>();
        setMonitoringResultTypes.add(new SetMonitoringResultType(
                SetMonitoringStatusEnumType.ACCEPTED,
                MonitorEnumType.DELTA,
                new ComponentType(),
                new VariableType(),
                1
        ));
        return new SetVariableMonitoringResponse(setMonitoringResultTypes);
    }
}
