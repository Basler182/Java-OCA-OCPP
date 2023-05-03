package extrawest.ocppv2_0_1clientexample;

import extrawest.ocpp.JSONClient;
import extrawest.ocpp.OccurenceConstraintException;
import extrawest.ocpp.UnsupportedFeatureException;
import extrawest.ocpp.model.dataTypes.*;
import extrawest.ocpp.model.dataTypes.enums.*;
import extrawest.ocpp.model.request.*;
import extrawest.ocpp.model.response.*;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Slf4j
@Component
public class OCPPHandlerTest {

    @Autowired
    private JSONClient jsonClient;

    @Autowired
    private ApiConfigurations apiConfigurations;

    @PostConstruct
    public void testOCPPAuthorizeHandler() {
        String url = "ws://" + apiConfigurations.getWebSocketBaseUrl();
        AuthorizeRequest authRequest = new AuthorizeRequest(
                new IdTokenType("idToken", IdTokenEnumType.CENTRAL)
        );
        BootNotificationRequest bootNotificationRequest = new BootNotificationRequest(
                BootReasonEnumType.POWER_UP,
                new ChargingStationType("model", "vendorName")
        );
        ClearedChargingLimitRequest clearedChargingLimitRequest = new ClearedChargingLimitRequest(
                ChargingLimitSourceEnumType.OTHER
        );
        FirmwareStatusNotificationRequest firmwareStatusNotificationRequest = new FirmwareStatusNotificationRequest(
                FirmwareStatusEnumType.INSTALLED
        );
        Get15118EVCertificateRequest get15118EVCertificateRequest = new Get15118EVCertificateRequest(
                "iso15118SchemaVersion",
                CertificateActionEnumType.INSTALL,
                "exiRequest"
        );
        GetCertificateStatusRequest getCertificateStatusRequest = new GetCertificateStatusRequest(
                new OCSPRequestDataType(
                        HashAlgorithmEnumType.SHA_256,
                        "issuerNameHash",
                        "issuerKeyHash",
                        "serialNumber",
                        "responderURL"
                )
        );
        HeartbeatRequest heartbeatRequest = new HeartbeatRequest();
        LogStatusNotificationRequest logStatusNotificationRequest = new LogStatusNotificationRequest(
                UploadLogStatusEnumType.ACCEPTED_CANCELED
        );
        List<MeterValueType> meterValueTypes = new ArrayList<>();
        List<SampledValueType> sampledValueTypes = new ArrayList<>();
        sampledValueTypes.add(new SampledValueType(2.0));
        meterValueTypes.add(new MeterValueType(
                sampledValueTypes,
                LocalDateTime.now()
        ));
        MeterValuesRequest meterValuesRequest = new MeterValuesRequest(
                1,
                meterValueTypes
        );
        NotifyChargingLimitRequest notifyChargingLimitRequest = new NotifyChargingLimitRequest(
                new ChargingLimitType(ChargingLimitSourceEnumType.SO)
        );
        NotifyCustomerInformationRequest notifyCustomerInformationRequest = new NotifyCustomerInformationRequest(
                "data",
                1,
                LocalDateTime.now(),
                1
        );
        NotifyDisplayMessagesRequest notifyDisplayMessagesRequest = new NotifyDisplayMessagesRequest(1);
        NotifyEVChargingNeedsRequest notifyEVChargingNeedsRequest = new NotifyEVChargingNeedsRequest(
                new ChargingNeedsType(EnergyTransferModeEnumType.AC_SINGLE_PHASE),
                1
        );
        List<ChargingSchedulePeriodType> chargingSchedulePeriodTypes = new ArrayList<>();
        chargingSchedulePeriodTypes.add(new ChargingSchedulePeriodType(1, 1.1));
        NotifyEVChargingScheduleRequest notifyEVChargingScheduleRequest = new NotifyEVChargingScheduleRequest(
                LocalDateTime.now(),
                new ChargingScheduleType(
                        1,
                        ChargingRateUnitEnumType.A,
                        chargingSchedulePeriodTypes
                ),
                1
        );
        List<EventDataType> eventDataTypes = new ArrayList<>();
        eventDataTypes.add(new EventDataType(
                1,
                LocalDateTime.now(),
                EventTriggerEnumType.ALERTING,
                "actualValue",
                new ComponentType(),
                EventNotificationEnumType.HARD_WIRED_NOTIFICATION,
                new VariableType()
        ));
        NotifyEventRequest notifyEventRequest = new NotifyEventRequest(
                LocalDateTime.now(),
                1,
                eventDataTypes
        );
        NotifyMonitoringReportRequest notifyMonitoringReportRequest = new NotifyMonitoringReportRequest(
                1,
                1,
                LocalDateTime.now()
        );
        NotifyReportRequest notifyReportRequest = new NotifyReportRequest(
                1,
                LocalDateTime.now(),
                1
        );
        PublishFirmwareStatusNotificationRequest publishFirmwareStatusNotificationRequest = new PublishFirmwareStatusNotificationRequest(
                PublishFirmwareStatusEnumType.DOWNLOADED
        );
        List<ChargingScheduleType> chargingScheduleTypes = new ArrayList<>();
        chargingScheduleTypes.add(new ChargingScheduleType(
                1,
                ChargingRateUnitEnumType.A,
                chargingSchedulePeriodTypes
        ));
        List<ChargingProfileType> chargingProfileTypes = new ArrayList<>();
        chargingProfileTypes.add(new ChargingProfileType(
                1,
                1,
                ChargingProfilePurposeEnumType.TX_PROFILE,
                ChargingProfileKindEnumType.ABSOLUTE,
                chargingScheduleTypes
        ));
        ReportChargingProfilesRequest reportChargingProfilesRequest = new ReportChargingProfilesRequest(
                1,
                ChargingLimitSourceEnumType.OTHER,
                chargingProfileTypes,
                1
        );
        ReservationStatusUpdateRequest reservationStatusUpdateRequest = new ReservationStatusUpdateRequest(
                1,
                ReservationUpdateStatusEnumType.EXPIRED
        );
        SecurityEventNotificationRequest securityEventNotificationRequest = new SecurityEventNotificationRequest(
                "type",
                LocalDateTime.now()
        );
        SignCertificateRequest signCertificateRequest = new SignCertificateRequest("csr");
        StatusNotificationRequest statusNotificationRequest = new StatusNotificationRequest(
                LocalDateTime.now(),
                ConnectorStatusEnumType.AVAILABLE,
                1,
                1
        );
        TransactionEventRequest transactionEventRequest = new TransactionEventRequest(
                TransactionEventEnumType.STARTED,
                LocalDateTime.now(),
                TriggerReasonEnumType.TRIGGER,
                1,
                new TransactionType("d3c02267-2726-4aef-a721-c65338183977")
        );

        jsonClient.connect(url, null);
        try {
            for (int i = 0; i < 1; i++) {
                AuthorizeResponse authorizeConfirmation = (AuthorizeResponse) jsonClient
                        .send(authRequest).toCompletableFuture().get();
                System.out.println(authorizeConfirmation.toString());
                System.out.println("");

                BootNotificationResponse bootNotificationResponse = (BootNotificationResponse) jsonClient
                        .send(bootNotificationRequest).toCompletableFuture().get();
                System.out.println(bootNotificationResponse.toString());
                System.out.println("");

                TransactionEventResponse transactionEventResponse = (TransactionEventResponse) jsonClient
                        .send(transactionEventRequest).toCompletableFuture().get();
                System.out.println(transactionEventResponse.toString());
                System.out.println("");

                ClearedChargingLimitResponse clearedChargingLimitResponse = (ClearedChargingLimitResponse) jsonClient
                        .send(clearedChargingLimitRequest).toCompletableFuture().get();
                System.out.println(clearedChargingLimitResponse.toString());
                System.out.println("");

                FirmwareStatusNotificationResponse firmwareStatusNotificationResponse = (FirmwareStatusNotificationResponse) jsonClient
                        .send(firmwareStatusNotificationRequest).toCompletableFuture().get();
                System.out.println(firmwareStatusNotificationResponse.toString());
                System.out.println("");

                Get15118EVCertificateResponse get15118EVCertificateResponse = (Get15118EVCertificateResponse) jsonClient
                        .send(get15118EVCertificateRequest).toCompletableFuture().get();
                System.out.println(get15118EVCertificateResponse.toString());
                System.out.println("");

                GetCertificateStatusResponse getCertificateStatusResponse = (GetCertificateStatusResponse) jsonClient
                        .send(getCertificateStatusRequest).toCompletableFuture().get();
                System.out.println(getCertificateStatusResponse.toString());
                System.out.println("");

                HeartbeatResponse heartbeatResponse = (HeartbeatResponse) jsonClient
                        .send(heartbeatRequest).toCompletableFuture().get();
                System.out.println(heartbeatResponse.toString());
                System.out.println("");

                MeterValuesResponse meterValuesResponse = (MeterValuesResponse) jsonClient
                        .send(meterValuesRequest).toCompletableFuture().get();
                System.out.println(meterValuesResponse.toString());
                System.out.println("");

                NotifyChargingLimitResponse notifyChargingLimitResponse = (NotifyChargingLimitResponse) jsonClient
                        .send(notifyChargingLimitRequest).toCompletableFuture().get();
                System.out.println(notifyChargingLimitResponse.toString());
                System.out.println("");

                NotifyCustomerInformationResponse notifyCustomerInformationResponse = (NotifyCustomerInformationResponse) jsonClient
                        .send(notifyCustomerInformationRequest).toCompletableFuture().get();
                System.out.println(notifyCustomerInformationResponse.toString());
                System.out.println("");

                NotifyDisplayMessagesResponse notifyDisplayMessagesResponse = (NotifyDisplayMessagesResponse) jsonClient
                        .send(notifyDisplayMessagesRequest).toCompletableFuture().get();
                System.out.println(notifyDisplayMessagesResponse.toString());
                System.out.println("");

                NotifyEVChargingNeedsResponse notifyEVChargingNeedsResponse = (NotifyEVChargingNeedsResponse) jsonClient
                        .send(notifyEVChargingNeedsRequest).toCompletableFuture().get();
                System.out.println(notifyEVChargingNeedsResponse.toString());
                System.out.println("");

                NotifyEVChargingScheduleResponse notifyEVChargingScheduleResponse = (NotifyEVChargingScheduleResponse) jsonClient
                        .send(notifyEVChargingScheduleRequest).toCompletableFuture().get();
                System.out.println(notifyEVChargingScheduleResponse.toString());
                System.out.println("");

                NotifyEventResponse notifyEventResponse = (NotifyEventResponse) jsonClient
                        .send(notifyEventRequest).toCompletableFuture().get();
                System.out.println(notifyEventResponse.toString());
                System.out.println("");

                NotifyMonitoringReportResponse notifyMonitoringReportResponse = (NotifyMonitoringReportResponse) jsonClient
                        .send(notifyMonitoringReportRequest).toCompletableFuture().get();
                System.out.println(notifyMonitoringReportResponse.toString());
                System.out.println("");

                NotifyReportResponse notifyReportResponse = (NotifyReportResponse) jsonClient
                        .send(notifyReportRequest).toCompletableFuture().get();
                System.out.println(notifyReportResponse.toString());
                System.out.println("");

                PublishFirmwareStatusNotificationResponse publishFirmwareStatusNotificationResponse = (PublishFirmwareStatusNotificationResponse) jsonClient
                        .send(publishFirmwareStatusNotificationRequest).toCompletableFuture().get();
                System.out.println(publishFirmwareStatusNotificationResponse.toString());
                System.out.println("");

                ReportChargingProfilesResponse reportChargingProfilesResponse = (ReportChargingProfilesResponse) jsonClient
                        .send(reportChargingProfilesRequest).toCompletableFuture().get();
                System.out.println(reportChargingProfilesResponse.toString());
                System.out.println("");

                ReservationStatusUpdateResponse reservationStatusUpdateResponse = (ReservationStatusUpdateResponse) jsonClient
                        .send(reservationStatusUpdateRequest).toCompletableFuture().get();
                System.out.println(reservationStatusUpdateResponse.toString());
                System.out.println("");

                SecurityEventNotificationResponse securityEventNotificationResponse = (SecurityEventNotificationResponse) jsonClient
                        .send(securityEventNotificationRequest).toCompletableFuture().get();
                System.out.println(securityEventNotificationResponse.toString());
                System.out.println("");

                SignCertificateResponse signCertificateResponse = (SignCertificateResponse) jsonClient
                        .send(signCertificateRequest).toCompletableFuture().get();
                System.out.println(signCertificateResponse.toString());
                System.out.println("");

                StatusNotificationResponse statusNotificationResponse = (StatusNotificationResponse) jsonClient
                        .send(statusNotificationRequest).toCompletableFuture().get();
                System.out.println(statusNotificationResponse.toString());
                System.out.println("");
            }
        } catch (OccurenceConstraintException | UnsupportedFeatureException
                | ExecutionException | InterruptedException e) {
            log.error("Exception occurred: " + e);
            log.error("Test will fail");
        }
    }
}
