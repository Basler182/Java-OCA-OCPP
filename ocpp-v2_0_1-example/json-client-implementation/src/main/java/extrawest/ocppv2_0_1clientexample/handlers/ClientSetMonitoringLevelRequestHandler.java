package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientSetMonitoringLevelRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.GenericStatusEnumType;
import extrawest.ocpp.model.request.SetMonitoringLevelRequest;
import extrawest.ocpp.model.response.SetMonitoringLevelResponse;

public class ClientSetMonitoringLevelRequestHandler implements IClientSetMonitoringLevelRequestHandler {
    @Override
    public SetMonitoringLevelResponse handleSetMonitoringLevelRequest(SetMonitoringLevelRequest request) {
        System.out.println(request.toString());
        return new SetMonitoringLevelResponse(GenericStatusEnumType.ACCEPTED);
    }
}
