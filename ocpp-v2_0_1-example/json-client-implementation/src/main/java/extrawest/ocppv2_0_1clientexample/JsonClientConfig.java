package extrawest.ocppv2_0_1clientexample;

import extrawest.ocpp.JSONClient;
import extrawest.ocpp.features.client.*;
import extrawest.ocpp.features.server.*;
import extrawest.ocppv2_0_1clientexample.handlers.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class JsonClientConfig {

    @Bean
    public JSONClient configureJsonClient() {
        JSONClient jsonClient = new JSONClient();

        jsonClient.addFeature(new CancelReservationFeature(new ClientCancelReservationRequestHandler()));
        jsonClient.addFeature(new CertificateSignedFeature(new ClientCertificateSignedRequestHandler()));
        jsonClient.addFeature(new ChangeAvailabilityFeature(new ClientChangeAvailabilityRequestHandler()));
        jsonClient.addFeature(new ClearCacheFeature(new ClientClearCacheRequestHandler()));
        jsonClient.addFeature(new ClearChargingProfileFeature(new ClientClearChargingProfileRequestHandler()));
        jsonClient.addFeature(new ClearDisplayMessageFeature(new ClientClearDisplayMessageRequestHandler()));
        jsonClient.addFeature(new ClearVariableMonitoringFeature(new ClientClearVariableMonitoringRequestHandler()));
        jsonClient.addFeature(new CostUpdatedFeature(new ClientCostUpdatedRequestHandler()));
        jsonClient.addFeature(new CustomerInformationFeature(new ClientCustomerInformationRequestHandler()));
        jsonClient.addFeature(new DataTransferFeature(new ClientDataTransferRequestHandler()));
        jsonClient.addFeature(new DeleteCertificateFeature(new ClientDeleteCertificateRequestHandler()));
        jsonClient.addFeature(new GetBaseReportFeature(new ClientGetBaseReportRequestHandler()));
        jsonClient.addFeature(new GetChargingProfilesFeature(new ClientGetChargingProfilesRequestHandler()));
        jsonClient.addFeature(new GetCompositeScheduleFeature(new ClientGetCompositeScheduleRequestHandler()));
        jsonClient.addFeature(new GetDisplayMessagesFeature(new ClientGetDisplayMessagesRequestHandler()));
        jsonClient.addFeature(new GetInstalledCertificateIdsFeature(new ClientGetInstalledCertificateIdsRequestHandler()));
        jsonClient.addFeature(new GetLocalListVersionFeature(new ClientGetLocalListVersionRequestHandler()));
        jsonClient.addFeature(new GetLogFeature(new ClientGetLogRequestHandler()));
        jsonClient.addFeature(new GetMonitoringReportFeature(new ClientGetMonitoringReportRequestHandler()));
        jsonClient.addFeature(new GetReportFeature(new ClientGetReportRequestHandler()));
        jsonClient.addFeature(new GetTransactionStatusFeature(new ClientGetTransactionStatusRequestHandler()));
        jsonClient.addFeature(new GetVariablesFeature(new ClientGetVariablesRequestHandler()));
        jsonClient.addFeature(new InstallCertificateFeature(new ClientInstallCertificateRequestHandler()));
        jsonClient.addFeature(new PublishFirmwareFeature(new ClientPublishFirmwareRequestHandler()));
        jsonClient.addFeature(new RequestStartTransactionFeature(new ClientRequestStartTransactionRequestHandler()));
        jsonClient.addFeature(new RequestStopTransactionFeature(new ClientRequestStopTransactionRequestHandler()));
        jsonClient.addFeature(new ReserveNowFeature(new ClientReserveNowRequestHandler()));
        jsonClient.addFeature(new ResetFeature(new ClientResetRequestHandler()));
        jsonClient.addFeature(new SendLocalListFeature(new ClientSendLocalListRequestHandler()));
        jsonClient.addFeature(new SetChargingProfileFeature(new ClientSetChargingProfileRequestHandler()));
        jsonClient.addFeature(new SetDisplayMessageFeature(new ClientSetDisplayMessageRequestHandler()));
        jsonClient.addFeature(new SetMonitoringBaseFeature(new ClientSetMonitoringBaseRequestHandler()));
        jsonClient.addFeature(new SetMonitoringLevelFeature(new ClientSetMonitoringLevelRequestHandler()));
        jsonClient.addFeature(new SetNetworkProfileFeature(new ClientSetNetworkProfileRequestHandler()));
        jsonClient.addFeature(new SetVariableMonitoringFeature(new ClientSetVariableMonitoringRequestHandler()));
        jsonClient.addFeature(new SetVariablesFeature(new ClientSetVariablesRequestHandler()));
        jsonClient.addFeature(new TriggerMessageFeature(new ClientTriggerMessageRequestHandler()));
        jsonClient.addFeature(new UnlockConnectorFeature(new ClientUnlockConnectorRequestHandler()));
        jsonClient.addFeature(new UnpublishFirmwareFeature(new ClientUnpublishFirmwareRequestHandler()));
        jsonClient.addFeature(new UpdateFirmwareFeature(new ClientUpdateFirmwareRequestHandler()));

        jsonClient.addFeature(new AuthorizeFeature(null));
        jsonClient.addFeature(new BootNotificationFeature(null));
        jsonClient.addFeature(new ClearedChargingLimitFeature(null));
        jsonClient.addFeature(new FirmwareStatusNotificationFeature(null));
        jsonClient.addFeature(new Get15118EVCertificateFeature(null));
        jsonClient.addFeature(new GetCertificateStatusFeature(null));
        jsonClient.addFeature(new HeartbeatFeature(null));
        jsonClient.addFeature(new LogStatusNotificationFeature(null));
        jsonClient.addFeature(new MeterValuesFeature(null));
        jsonClient.addFeature(new NotifyChargingLimitFeature(null));
        jsonClient.addFeature(new NotifyCustomerInformationFeature(null));
        jsonClient.addFeature(new NotifyDisplayMessagesFeature(null));
        jsonClient.addFeature(new NotifyEVChargingNeedsFeature(null));
        jsonClient.addFeature(new NotifyEVChargingScheduleFeature(null));
        jsonClient.addFeature(new NotifyEventFeature(null));
        jsonClient.addFeature(new NotifyMonitoringReportFeature(null));
        jsonClient.addFeature(new NotifyReportFeature(null));
        jsonClient.addFeature(new PublishFirmwareStatusNotificationFeature(null));
        jsonClient.addFeature(new ReportChargingProfilesFeature(null));
        jsonClient.addFeature(new ReservationStatusUpdateFeature(null));
        jsonClient.addFeature(new SecurityEventNotificationFeature(null));
        jsonClient.addFeature(new SignCertificateFeature(null));
        jsonClient.addFeature(new StatusNotificationFeature(null));
        jsonClient.addFeature(new TransactionEventFeature(null));
        return jsonClient;
    }
}
