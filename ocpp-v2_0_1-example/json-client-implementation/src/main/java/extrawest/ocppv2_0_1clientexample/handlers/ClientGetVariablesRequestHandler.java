package extrawest.ocppv2_0_1clientexample.handlers;

import extrawest.ocpp.features.client.handlers.IClientGetVariablesRequestHandler;
import extrawest.ocpp.model.dataTypes.ComponentType;
import extrawest.ocpp.model.dataTypes.GetVariableResultType;
import extrawest.ocpp.model.dataTypes.VariableType;
import extrawest.ocpp.model.dataTypes.enums.GetVariableStatusEnumType;
import extrawest.ocpp.model.request.GetVariablesRequest;
import extrawest.ocpp.model.response.GetVariablesResponse;

public class ClientGetVariablesRequestHandler implements IClientGetVariablesRequestHandler {
    @Override
    public GetVariablesResponse handleGetVariablesRequest(GetVariablesRequest request) {
        System.out.println(request.toString());
        GetVariableResultType[] getVariableResultTypes = new GetVariableResultType[2];
        GetVariableResultType getVariableResultType1 = new GetVariableResultType(
                GetVariableStatusEnumType.ACCEPTED,
                new ComponentType("name"),
                new VariableType("name"));
        getVariableResultType1.setAttributeValue("attributeValue");
        GetVariableResultType getVariableResultType2 = new GetVariableResultType(
                GetVariableStatusEnumType.ACCEPTED,
                new ComponentType("name"),
                new VariableType("name"));
        getVariableResultType2.setAttributeValue("attributeValue");
        getVariableResultTypes[0] = getVariableResultType1;
        getVariableResultTypes[1] = getVariableResultType2;
        return new GetVariablesResponse(getVariableResultTypes);
    }
}
