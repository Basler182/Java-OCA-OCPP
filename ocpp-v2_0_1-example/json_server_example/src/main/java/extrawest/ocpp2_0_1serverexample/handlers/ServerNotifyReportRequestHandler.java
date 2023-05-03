package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.features.server.handlers.IServerNotifyReportRequestHandler;
import extrawest.ocpp.model.request.NotifyReportRequest;
import extrawest.ocpp.model.response.NotifyReportResponse;

import java.util.UUID;

public class ServerNotifyReportRequestHandler implements IServerNotifyReportRequestHandler {
    @Override
    public NotifyReportResponse handleNotifyReportRequest(UUID sessionIndex, NotifyReportRequest request) {
        return new NotifyReportResponse();
    }
}
