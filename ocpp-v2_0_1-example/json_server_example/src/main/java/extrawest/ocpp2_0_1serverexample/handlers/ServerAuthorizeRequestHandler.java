package extrawest.ocpp2_0_1serverexample.handlers;

import extrawest.ocpp.JSONServer;
import extrawest.ocpp.NotConnectedException;
import extrawest.ocpp.OccurenceConstraintException;
import extrawest.ocpp.UnsupportedFeatureException;
import extrawest.ocpp.features.server.handlers.*;
import extrawest.ocpp.model.dataTypes.*;
import extrawest.ocpp.model.dataTypes.enums.*;
import extrawest.ocpp.model.request.*;
import extrawest.ocpp.model.response.AuthorizeResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ServerAuthorizeRequestHandler implements IServerAuthorizeRequestHandler {
    public final JSONServer jsonServer;

    public ServerAuthorizeRequestHandler(@Autowired JSONServer jsonServer) {
        this.jsonServer = jsonServer;
    }

    @Override
    public AuthorizeResponse handleAuthorizeRequest(UUID sessionIndex, AuthorizeRequest request) {
        sendClearCacheRequest(sessionIndex);
        sendCancelReservationRequest(sessionIndex);
        sendCertificateSignedRequest(sessionIndex);
        sendChangeAvailabilityRequest(sessionIndex);
        sendClearChargingProfileRequest(sessionIndex);
        sendClearDisplayMessageRequest(sessionIndex);
        sendClearVariableMonitoringRequest(sessionIndex);
        sendCostUpdatedRequest(sessionIndex);
        sendCustomerInformationRequest(sessionIndex);
        sendDataTransferRequest(sessionIndex);
        sendDeleteCertificateRequest(sessionIndex);
        sendGetBaseReportRequest(sessionIndex);
        sendGetChargingProfilesRequest(sessionIndex);
        sendGetCompositeScheduleRequest(sessionIndex);
        sendGetDisplayMessagesRequest(sessionIndex);
        sendGetInstalledCertificateIdsRequest(sessionIndex);
        sendGetLocalListVersionRequest(sessionIndex);
        sendGetLogRequestRequest(sessionIndex);
        sendGetMonitoringReportRequest(sessionIndex);
        sendGetReportRequest(sessionIndex);
        sendGetTransactionStatusRequest(sessionIndex);
        sendGetVariablesRequest(sessionIndex);
        sendInstallCertificateRequest(sessionIndex);
        sendPublishFirmwareRequest(sessionIndex);
        sendRequestStartTransactionRequest(sessionIndex);
        sendRequestStopTransactionRequest(sessionIndex);
        sendReserveNowRequest(sessionIndex);
        sendResetRequest(sessionIndex);
        sendSendLocalListRequest(sessionIndex);
        sendSetChargingProfileRequest(sessionIndex);
        sendSetDisplayMessageRequest(sessionIndex);
        sendSetMonitoringBaseRequest(sessionIndex);
        sendSetMonitoringLevelRequest(sessionIndex);
        sendSetNetworkProfileRequest(sessionIndex);
        sendSetVariableMonitoringRequest(sessionIndex);
        sendSetVariablesRequest(sessionIndex);
        sendTriggerMessageRequest(sessionIndex);
        sendUnlockConnectorRequest(sessionIndex);
        sendUnpublishFirmwareRequest(sessionIndex);
        sendUpdateFirmwareRequest(sessionIndex);
        return new AuthorizeResponse(new IdTokenInfoType(AuthorizationStatusEnumType.ACCEPTED));
    }

    private void sendCancelReservationRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new CancelReservationRequest(1));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendCertificateSignedRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new CertificateSignedRequest("certificateChain"));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendChangeAvailabilityRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new ChangeAvailabilityRequest(OperationalStatusEnumType.OPERATIVE));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendClearCacheRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new ClearCacheRequest());
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendClearChargingProfileRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new ClearChargingProfileRequest());
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendClearDisplayMessageRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new ClearDisplayMessageRequest(1));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendClearVariableMonitoringRequest(UUID sessionIndex) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        try {
            jsonServer.send(sessionIndex, new ClearVariableMonitoringRequest(integerList));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendCostUpdatedRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new CostUpdatedRequest(2.0f, "transactionId"));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendCustomerInformationRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new CustomerInformationRequest(1, true, true));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendDataTransferRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new DataTransferRequest("vendorId"));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendDeleteCertificateRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new DeleteCertificateRequest(
                    new CertificateHashDataType(
                            HashAlgorithmEnumType.SHA_256,
                            "issuerNameHash",
                            "issuerKeyHash",
                            "serialNumber"
                    )
            ));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendGetBaseReportRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new GetBaseReportRequest(
                    1,
                    ReportBaseEnumType.CONFIGURATION_INVENTORY
            ));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendGetChargingProfilesRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new GetChargingProfilesRequest(
                    1,
                    new ChargingProfileCriterionType()
            ));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendGetCompositeScheduleRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new GetCompositeScheduleRequest(1, 1));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendGetDisplayMessagesRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new GetDisplayMessagesRequest(1));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendGetInstalledCertificateIdsRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new GetInstalledCertificateIdsRequest());
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendGetLocalListVersionRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new GetLocalListVersionRequest());
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendGetLogRequestRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new GetLogRequest(
                    new LogParametersType("remoteLocation"),
                    LogEnumType.DIAGNOSTICS_LOG,
                    1
            ));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendGetMonitoringReportRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new GetMonitoringReportRequest(1));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendGetReportRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new GetReportRequest(1));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendGetTransactionStatusRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new GetTransactionStatusRequest());
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendGetVariablesRequest(UUID sessionIndex) {
        GetVariableDataType[] getVariableData = new GetVariableDataType[2];
        getVariableData[0] = new GetVariableDataType(
                new ComponentType("name"),
                new VariableType("name")
        );
        getVariableData[1] = new GetVariableDataType(
                new ComponentType("name"),
                new VariableType("name")
        );
        try {
            jsonServer.send(sessionIndex, new GetVariablesRequest(getVariableData));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendInstallCertificateRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new InstallCertificateRequest(
                    InstallCertificateUseEnumType.CSMS_ROOT_CERTIFICATE,
                    "certificate"
            ));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendPublishFirmwareRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new PublishFirmwareRequest(
                    "location",
                    "checkSum",
                    1
            ));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendRequestStartTransactionRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new RequestStartTransactionRequest(
                    new IdTokenType(
                            "dfba8704-f579-454b-9a8a-9f27c93a4304",
                            IdTokenEnumType.CENTRAL
                    ),
                    123
            ));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendRequestStopTransactionRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new RequestStopTransactionRequest(
                    "dfba8704-f579-454b-9a8a-9f27c93a4304"
            ));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendReserveNowRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new ReserveNowRequest(
                    1,
                    LocalDateTime.now(),
                    new IdTokenType(
                            "dfba8704-f579-454b-9a8a-9f27c93a4304",
                            IdTokenEnumType.CENTRAL
                    )
            ));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendResetRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new ResetRequest(ResetEnumType.IMMEDIATE));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendSendLocalListRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new SendLocalListRequest(
                    1,
                    UpdateEnumType.DIFFERENTIAL
            ));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendSetChargingProfileRequest(UUID sessionIndex) {
        List<ChargingScheduleType> chargingScheduleTypes = new ArrayList<>();
        List<ChargingSchedulePeriodType> chargingSchedulePeriodTypes = new ArrayList<>();
        chargingSchedulePeriodTypes.add(new ChargingSchedulePeriodType(1, 2.0));
        chargingScheduleTypes.add(new ChargingScheduleType(
                1,
                ChargingRateUnitEnumType.A,
                chargingSchedulePeriodTypes
        ));
        try {
            jsonServer.send(sessionIndex, new SetChargingProfileRequest(
                    1,
                    new ChargingProfileType(
                            1,
                            2,
                            ChargingProfilePurposeEnumType.TX_PROFILE,
                            ChargingProfileKindEnumType.ABSOLUTE,
                            chargingScheduleTypes
                    )
            ));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendSetDisplayMessageRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new SetDisplayMessageRequest(
                    new MessageInfoType(
                            1,
                            MessagePriorityEnumType.NORMAL_CYCLE,
                            new MessageContentType(
                                    MessageFormatEnumType.HTML,
                                    "content"
                            )
                    )
            ));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendSetMonitoringBaseRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new SetMonitoringBaseRequest(MonitoringBaseEnumType.ALL));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendSetMonitoringLevelRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new SetMonitoringLevelRequest(1));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendSetNetworkProfileRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new SetNetworkProfileRequest(
                    1,
                    new NetworkConnectionProfileType(
                            OCPPVersionEnumType.OCPP_20,
                            OCPPTransportEnumType.JSON,
                            "ocppCsmsUrl",
                            1,
                            1,
                            OCPPInterfaceEnumType.WIRED_3
                    )
            ));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendSetVariableMonitoringRequest(UUID sessionIndex) {
        List<SetMonitoringDataType> setMonitoringDataTypes = new ArrayList<>();
        setMonitoringDataTypes.add(new SetMonitoringDataType(
                2.0f,
                MonitorEnumType.DELTA,
                1,
                new ComponentType(),
                new VariableType()
        ));
        try {
            jsonServer.send(sessionIndex, new SetVariableMonitoringRequest(setMonitoringDataTypes));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendSetVariablesRequest(UUID sessionIndex) {
        SetVariableDataType[] setVariableDataTypes = new SetVariableDataType[2];
        setVariableDataTypes[0] = new SetVariableDataType(
                "attributeValue",
                new ComponentType("name"),
                new VariableType("name")
        );
        setVariableDataTypes[1] = new SetVariableDataType(
                "attributeValue",
                new ComponentType("name"),
                new VariableType("name")
        );
        try {
            jsonServer.send(sessionIndex, new SetVariablesRequest(setVariableDataTypes));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendTriggerMessageRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new TriggerMessageRequest(MessageTriggerEnumType.BOOT_NOTIFICATION));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendUnlockConnectorRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new UnlockConnectorRequest(1, 1));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendUnpublishFirmwareRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new UnpublishFirmwareRequest("checkSum"));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendUpdateFirmwareRequest(UUID sessionIndex) {
        try {
            jsonServer.send(sessionIndex, new UpdateFirmwareRequest(
                    1,
                    new FirmwareType(
                            "location",
                            LocalDateTime.now()
                    )
            ));
        } catch (OccurenceConstraintException | NotConnectedException | UnsupportedFeatureException e) {
            throw new RuntimeException(e);
        }
    }
}
