package extrawest.ocpp2_0_1serverexample.config;

import extrawest.ocpp.JSONServer;
import extrawest.ocpp.features.client.*;
import extrawest.ocpp.features.server.*;
import extrawest.ocpp2_0_1serverexample.handlers.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class JsonServerConfig {

    @Bean
    public JSONServer jsonServer() {
        JSONServer jsonServer = new JSONServer();
        jsonServer.addFeature(new AuthorizeFeature(new ServerAuthorizeRequestHandler(jsonServer)));
        jsonServer.addFeature(new BootNotificationFeature(new ServerBootNotificationRequestHandler()));
        jsonServer.addFeature(new ClearedChargingLimitFeature(new ServerClearedChargingLimitRequestHandler()));
        jsonServer.addFeature(new FirmwareStatusNotificationFeature(new ServerFirmwareStatusNotificationRequestHandler()));
        jsonServer.addFeature(new Get15118EVCertificateFeature(new ServerGet15118EVCertificateRequestHandler()));
        jsonServer.addFeature(new GetCertificateStatusFeature(new ServerGetCertificateStatusRequestHandler()));
        jsonServer.addFeature(new HeartbeatFeature(new ServerHeartbeatRequestHandler()));
        jsonServer.addFeature(new LogStatusNotificationFeature(new ServerLogStatusNotificationRequestHandler()));
        jsonServer.addFeature(new MeterValuesFeature(new ServerMeterValuesRequestHandler()));
        jsonServer.addFeature(new NotifyChargingLimitFeature(new ServerNotifyChargingLimitRequestHandler()));
        jsonServer.addFeature(new NotifyCustomerInformationFeature(new ServerNotifyCustomerInformationRequestHandler()));
        jsonServer.addFeature(new NotifyDisplayMessagesFeature(new ServerNotifyDisplayMessagesRequestHandler()));
        jsonServer.addFeature(new NotifyEVChargingNeedsFeature(new ServerNotifyEVChargingNeedsRequestHandler()));
        jsonServer.addFeature(new NotifyEVChargingScheduleFeature(new ServerNotifyEVChargingScheduleRequestHandler()));
        jsonServer.addFeature(new NotifyEventFeature(new ServerNotifyEventRequestHandler()));
        jsonServer.addFeature(new NotifyMonitoringReportFeature(new ServerNotifyMonitoringReportRequestHandler()));
        jsonServer.addFeature(new NotifyReportFeature(new ServerNotifyReportRequestHandler()));
        jsonServer.addFeature(new PublishFirmwareStatusNotificationFeature(new ServerPublishFirmwareStatusNotificationRequestHandler()));
        jsonServer.addFeature(new ReportChargingProfilesFeature(new ServerReportChargingProfilesRequestHandler()));
        jsonServer.addFeature(new ReservationStatusUpdateFeature(new ServerReservationStatusUpdateRequestHandler()));
        jsonServer.addFeature(new SecurityEventNotificationFeature(new ServerSecurityEventNotificationRequestHandler()));
        jsonServer.addFeature(new SignCertificateFeature(new ServerSignCertificateRequestHandler()));
        jsonServer.addFeature(new StatusNotificationFeature(new ServerStatusNotificationRequestHandler()));
        jsonServer.addFeature(new TransactionEventFeature(new ServerTransactionEventRequestHandler()));

        jsonServer.addFeature(new CancelReservationFeature(null));
        jsonServer.addFeature(new CertificateSignedFeature(null));
        jsonServer.addFeature(new ChangeAvailabilityFeature(null));
        jsonServer.addFeature(new ClearCacheFeature(null));
        jsonServer.addFeature(new ClearChargingProfileFeature(null));
        jsonServer.addFeature(new ClearDisplayMessageFeature(null));
        jsonServer.addFeature(new ClearVariableMonitoringFeature(null));
        jsonServer.addFeature(new CostUpdatedFeature(null));
        jsonServer.addFeature(new CustomerInformationFeature(null));
        jsonServer.addFeature(new DataTransferFeature(null));
        jsonServer.addFeature(new DeleteCertificateFeature(null));
        jsonServer.addFeature(new GetBaseReportFeature(null));
        jsonServer.addFeature(new GetChargingProfilesFeature(null));
        jsonServer.addFeature(new GetCompositeScheduleFeature(null));
        jsonServer.addFeature(new GetDisplayMessagesFeature(null));
        jsonServer.addFeature(new GetInstalledCertificateIdsFeature(null));
        jsonServer.addFeature(new GetLocalListVersionFeature(null));
        jsonServer.addFeature(new GetLogFeature(null));
        jsonServer.addFeature(new GetMonitoringReportFeature(null));
        jsonServer.addFeature(new GetReportFeature(null));
        jsonServer.addFeature(new GetTransactionStatusFeature(null));
        jsonServer.addFeature(new GetVariablesFeature(null));
        jsonServer.addFeature(new InstallCertificateFeature(null));
        jsonServer.addFeature(new PublishFirmwareFeature(null));
        jsonServer.addFeature(new RequestStartTransactionFeature(null));
        jsonServer.addFeature(new RequestStopTransactionFeature(null));
        jsonServer.addFeature(new ReserveNowFeature(null));
        jsonServer.addFeature(new ResetFeature(null));
        jsonServer.addFeature(new SendLocalListFeature(null));
        jsonServer.addFeature(new SetChargingProfileFeature(null));
        jsonServer.addFeature(new SetDisplayMessageFeature(null));
        jsonServer.addFeature(new SetMonitoringBaseFeature(null));
        jsonServer.addFeature(new SetMonitoringLevelFeature(null));
        jsonServer.addFeature(new SetNetworkProfileFeature(null));
        jsonServer.addFeature(new SetVariableMonitoringFeature(null));
        jsonServer.addFeature(new SetVariablesFeature(null));
        jsonServer.addFeature(new TriggerMessageFeature(null));
        jsonServer.addFeature(new UnlockConnectorFeature(null));
        jsonServer.addFeature(new UnpublishFirmwareFeature(null));
        jsonServer.addFeature(new UpdateFirmwareFeature(null));
        return jsonServer;
    }

}
