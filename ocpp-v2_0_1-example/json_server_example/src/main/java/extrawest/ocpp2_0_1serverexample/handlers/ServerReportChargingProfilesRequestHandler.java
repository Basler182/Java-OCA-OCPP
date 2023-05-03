package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerReportChargingProfilesRequestHandler;
import extrawest.ocpp.model.request.ReportChargingProfilesRequest;
import extrawest.ocpp.model.response.ReportChargingProfilesResponse;

import java.util.UUID;

public class ServerReportChargingProfilesRequestHandler implements IServerReportChargingProfilesRequestHandler {
    @Override
    public ReportChargingProfilesResponse handleReportChargingProfilesRequest(UUID sessionIndex, ReportChargingProfilesRequest request) {
        return new ReportChargingProfilesResponse();
    }
}
