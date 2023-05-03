package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerNotifyMonitoringReportRequestHandler;
import extrawest.ocpp.model.request.NotifyMonitoringReportRequest;
import extrawest.ocpp.model.response.NotifyMonitoringReportResponse;

import java.util.UUID;

public class ServerNotifyMonitoringReportRequestHandler implements IServerNotifyMonitoringReportRequestHandler {
    @Override
    public NotifyMonitoringReportResponse handleNotifyMonitoringReportRequest(UUID sessionIndex, NotifyMonitoringReportRequest request) {
        return new NotifyMonitoringReportResponse();
    }
}
