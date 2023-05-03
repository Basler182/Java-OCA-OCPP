package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientSetMonitoringBaseRequestHandler;
import extrawest.ocpp.model.dataTypes.enums.GenericDeviceModelStatusEnumType;
import extrawest.ocpp.model.request.SetMonitoringBaseRequest;
import extrawest.ocpp.model.response.SetMonitoringBaseResponse;

public class ClientSetMonitoringBaseRequestHandler implements IClientSetMonitoringBaseRequestHandler {
    @Override
    public SetMonitoringBaseResponse handleSetMonitoringBaseRequest(SetMonitoringBaseRequest request) {
        System.out.println(request.toString());
        return new SetMonitoringBaseResponse(GenericDeviceModelStatusEnumType.ACCEPTED);
    }
}
