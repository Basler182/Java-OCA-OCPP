package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientSetVariablesRequestHandler;
import extrawest.ocpp.model.dataTypes.ComponentType;
import extrawest.ocpp.model.dataTypes.SetVariableResultType;
import extrawest.ocpp.model.dataTypes.VariableType;
import extrawest.ocpp.model.dataTypes.enums.SetVariableStatusEnumType;
import extrawest.ocpp.model.request.SetVariablesRequest;
import extrawest.ocpp.model.response.SetVariablesResponse;

public class ClientSetVariablesRequestHandler implements IClientSetVariablesRequestHandler {
    @Override
    public SetVariablesResponse handleSetVariablesRequest(SetVariablesRequest request) {
        System.out.println(request.toString());
        SetVariableResultType[] setVariableResultTypes = new SetVariableResultType[2];
        setVariableResultTypes[0] = new SetVariableResultType(
                SetVariableStatusEnumType.ACCEPTED,
                new ComponentType("name"),
                new VariableType("name")
        );
        setVariableResultTypes[1] = new SetVariableResultType(
                SetVariableStatusEnumType.ACCEPTED,
                new ComponentType("name"),
                new VariableType("name"));
        return new SetVariablesResponse(setVariableResultTypes);
    }
}
