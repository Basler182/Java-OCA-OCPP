[![Java CI with Maven](https://github.com/extrawest/Extrawest-OCA-OCPP/actions/workflows/maven.yml/badge.svg)](https://github.com/extrawest/Extrawest-OCA-OCPP/actions/workflows/maven.yml)
[![codecov](https://codecov.io/gh/ChargeTimeEU/Java-OCA-OCPP/branch/master/graph/badge.svg)](https://codecov.io/gh/ChargeTimeEU/Java-OCA-OCPP)
[![Gitter](https://badges.gitter.im/ChargeTimeEU/Java-OCA-OCPP.svg)](https://gitter.im/ChargeTimeEU/Java-OCA-OCPP?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

Java-OCA-OCPP
=============

A client and server library of Open Charge-Point Protocol from openchargealliance.org

With this library, you can easily get started with the Open Charge-Point Protocol.
The design is driven by test, which will ensure premium software that is easy to adapt and modify to your needs.

Please note, this is a library and not an application, so there is no main method. 

Currently we support 1.6 SOAP or Web socket and 2.0.1 Web socket versions.

At 1.6 version incoming request events are split into feature profiles as described in the OCPP specification. At 2.0.1 ypu can choose what kind of events will be supported by Central System or Charging Client.
I recommend that you download and read the specification from openchargealliance.org


1.6 Server Realization
=====
For realization 1.6 OCPP JsonServer you need next classes:

``` Java
@Configuration
@Slf4j
public class JsonServerConfig {

    @Bean
    public JSONServer jsonServer(ServerCoreProfile core) {
        return new JSONServer(core);
    }

}
```

``` Java
@Configuration
@Getter
@Slf4j
public class ServerCoreProfileConfig {

    @Bean
    public ServerCoreEventHandler getCoreEventHandler() {
        return new ServerCoreEventHandler() {
            @Override
            public AuthorizeConfirmation handleAuthorizeRequest(UUID sessionIndex, AuthorizeRequest request) {

                System.out.println(request);
                // ... handle event
                IdTagInfo idTagInfo = new IdTagInfo();
                idTagInfo.setExpiryDate(ZonedDateTime.now());
                idTagInfo.setParentIdTag("test");
                idTagInfo.setStatus(AuthorizationStatus.Accepted);

                return new AuthorizeConfirmation(idTagInfo);
            }

            @Override
            public BootNotificationConfirmation handleBootNotificationRequest(UUID sessionIndex, BootNotificationRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public DataTransferConfirmation handleDataTransferRequest(UUID sessionIndex, DataTransferRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public HeartbeatConfirmation handleHeartbeatRequest(UUID sessionIndex, HeartbeatRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public MeterValuesConfirmation handleMeterValuesRequest(UUID sessionIndex, MeterValuesRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public StartTransactionConfirmation handleStartTransactionRequest(UUID sessionIndex, StartTransactionRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public StatusNotificationConfirmation handleStatusNotificationRequest(UUID sessionIndex, StatusNotificationRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public StopTransactionConfirmation handleStopTransactionRequest(UUID sessionIndex, StopTransactionRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }
        };
    }

    @Bean
    public ServerCoreProfile createCore(ServerCoreEventHandler serverCoreEventHandler) {
        return new ServerCoreProfile(serverCoreEventHandler);
    }
}
```

``` Java
@Configuration
@Getter
@Slf4j
public class ServerEventConfig {

    @Bean
    public ServerEvents createServerCoreImpl() {
        return getNewServerEventsImpl();
    }

    private ServerEvents getNewServerEventsImpl() {
        return new ServerEvents() {

            @Override
            public void newSession(UUID sessionIndex, SessionInformation information) {

                // sessionIndex is used to send messages.
                System.out.println("New session " + sessionIndex + ": " + information.getIdentifier());
            }

            @Override
            public void lostSession(UUID sessionIndex) {

                System.out.println("Session " + sessionIndex + " lost connection");
            }
        };
    }
}
```

``` Java
@Configuration
@EnableConfigurationProperties
@Getter
public class ApplicationConfiguration {

    @Value("${server.port}")
    private Integer serverPort;
}
```

``` Java
@Slf4j
@Component
@AllArgsConstructor
public class JsonServerImpl {

    private final ServerEvents serverEvents;
    private final JSONServer server;
    private final ApplicationConfiguration applicationConfiguration;

    @PostConstruct
    public void startServer() throws Exception {
        server.open("localhost", applicationConfiguration.getServerPort(), serverEvents);
    }
}
```

1.6 Client Realization
=====
For realization 1.6 OCPP JsonClient you need next classes:

``` Java
@Configuration
@Slf4j
public class JsonClientConfig {

    @Bean
    public JSONClient configureJsonClient(ClientCoreProfile core) {
        return new JSONClient(core);
    }
}
```

```Java
@Configuration
@Slf4j
public class ClientCoreProfileConfig {

    @Bean
    public ClientCoreProfile configureClientCoreProfile(ClientCoreEventHandler clientCoreEventHandler) {
        return new ClientCoreProfile(clientCoreEventHandler);
    }
}
```

``` Java
@Configuration
@Slf4j
public class ClientCoreEventHandlerConfig {

    @Bean
    public ClientCoreEventHandler configTestClient() {
        return new ClientCoreEventHandler() {
            @Override
            public ChangeAvailabilityConfirmation handleChangeAvailabilityRequest(ChangeAvailabilityRequest request) {

                System.out.println(request);
                // ... handle event

                return new ChangeAvailabilityConfirmation(AvailabilityStatus.Accepted);
            }

            @Override
            public GetConfigurationConfirmation handleGetConfigurationRequest(GetConfigurationRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public ChangeConfigurationConfirmation handleChangeConfigurationRequest(ChangeConfigurationRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public ClearCacheConfirmation handleClearCacheRequest(ClearCacheRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public DataTransferConfirmation handleDataTransferRequest(DataTransferRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public RemoteStartTransactionConfirmation handleRemoteStartTransactionRequest(RemoteStartTransactionRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public RemoteStopTransactionConfirmation handleRemoteStopTransactionRequest(RemoteStopTransactionRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public ResetConfirmation handleResetRequest(ResetRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public UnlockConnectorConfirmation handleUnlockConnectorRequest(UnlockConnectorRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }
        };
    }
}
```

```Java
public class OCPPHandlerTest {

    @Autowired
    private JSONClient jsonClient;

    @Autowired
    private ClientCoreProfile clientCoreProfile;

    @Autowired
    private ApiConfigurations apiConfigurations;

    @PostConstract
    public void testOCPPAuthorizeHandler() {
        String url = "ws://" + apiConfigurations.getWebSocketBaseUrl();
        AuthorizeRequest testRequest = clientCoreProfile.createAuthorizeRequest("testId");
        jsonClient.connect(url, null);
        try {
            AuthorizeConfirmation authorizeConfirmation = (AuthorizeConfirmation) jsonClient.send(testRequest)
                    .toCompletableFuture().get();
            assertTrue(true);
            assertEquals(AuthorizationStatus.Accepted,authorizeConfirmation.getIdTagInfo().getStatus());
        } catch (OccurenceConstraintException | UnsupportedFeatureException
                | ExecutionException | InterruptedException e) {
            log.error("Exception occurred: " + e);
            log.error("Test will fail");
            assertTrue(false);
        }
    }
}
```

2.0.1 Server Realization
=====
For realization 2.0.1 OCPP JsonServer you need next classes:
```Java
@Configuration
@Slf4j
public class JsonServerConfig {

    @Bean
    public JSONServer jsonServer() {
        JSONServer jsonServer = new JSONServer();
        //here you add features, that will be handled by server, so in constructor you need set handler for this feature
        jsonServer.addFeature(new AuthorizeFeature(new ServerAuthorizeRequestHandler()));
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

        //here you add features, that use only for sending this kind of requests (will handled by client), so you can set null as a handler parameter
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
```

```Java
@Slf4j
@Component
@AllArgsConstructor
public class JsonServerImpl {

    private final ServerEvents serverEvents;
    private final JSONServer server;
    private final ApplicationConfiguration applicationConfiguration;

    @PostConstruct
    public void startServer() throws Exception {
        server.open("localhost", applicationConfiguration.getServerPort(), serverEvents);
    }
}
```

```Java
@Configuration
@Getter
@Slf4j
public class ServerEventConfig {

    @Bean
    public ServerEvents createServerCoreImpl() {
        return getNewServerEventsImpl();
    }

    private ServerEvents getNewServerEventsImpl() {
        return new ServerEvents() {

            @Override
            public void authenticateSession(SessionInformation information, String username, byte[] password) throws AuthenticationException {
                System.out.println("authenticate session " + username);
            }

            @Override
            public void newSession(UUID sessionIndex, SessionInformation information) {

                // sessionIndex is used to send messages.
                System.out.println("New session " + sessionIndex + ": " + information.getIdentifier());
            }

            @Override
            public void lostSession(UUID sessionIndex) {

                System.out.println("Session " + sessionIndex + " lost connection");
            }
        };
    }
}
```

```Java
@Configuration
@EnableConfigurationProperties
public class ApplicationConfiguration {

    @Value("${server.port}")
    private Integer serverPort;

    public Integer getServerPort() {
        return serverPort;
    }
}
```

And handlers like this:
``` Java
public class ServerBootNotificationRequestHandler implements IServerBootNotificationRequestHandler {
    @Override
    public BootNotificationResponse handleBootNotificationRequest(UUID sessionIndex, BootNotificationRequest request) {
        return new BootNotificationResponse(LocalDateTime.now(), 10, RegistrationStatusEnumType.ACCEPTED);
    }
}
```

2.0.1 Client Realization
=====
For realization 2.0.1 OCPP JsonClient you need next classes:

```Java
@Configuration
@Slf4j
public class JsonClientConfig {

    @Bean
    public JSONClient configureJsonClient() {
        JSONClient jsonClient = new JSONClient();

        //here you add features, that will be handled by client, so in constructor you need set handler for this feature
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

        //here you add features, that use only for sending this kind of requests (will handled by server), so you can set null as a handler parameter
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
```

```Java
@Configuration
@EnableConfigurationProperties
@Getter
@Setter
public class ApiConfigurations {
    
    @Value("${websocket.url}")
    private String webSocketBaseUrl;
}
```

```Java
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
            }
        } catch (OccurenceConstraintException | UnsupportedFeatureException
                | ExecutionException | InterruptedException e) {
            log.error("Exception occurred: " + e);
            log.error("Test will fail");
        }
    }
}
```
And handlers like this one:
```Java
public class ClientCancelReservationRequestHandler implements IClientCancelReservationRequestHandler {
    @Override
    public CancelReservationResponse handleCancelReservationRequest(CancelReservationRequest request) {
        System.out.println(request.toString());
        return new CancelReservationResponse(CancelReservationStatusEnumType.ACCEPTED);
    }
}
```

Maven
=====

Find the maven repo here: https://mvnrepository.com/artifact/eu.chargetime.ocpp

Dependencies
============

Java-OCA-OCPP uses the following libraries:

* [Groovy-2.4](http://www.groovy-lang.org/)
* [JUnit4](http://junit.org/junit4/)
* [org.hamcrest:hamcrest-all:1.3](http://hamcrest.org)
* [org.mockito:mockito-core:1.10.19](http://mockito.org)
* [spock-core-0.7-groovy-2.0](http://spockframework.org)

To use version 1.6 you need the following libraries:

* [com.google.code.gson](https://github.com/google/gson)
* [org.java_websocket](https://github.com/TooTallNate/Java-WebSocket)

License
=======

[MIT License](LICENSE)

About Extrawest.com
=======

We are devoted to push the marked for vehicles charging forward.
There are many standards out there, we intend to implement and share them. Any help is much appreciated!

The market is in its defining state, the practices and standards we come up with now, may very well stick around for decades to come.

See our vision at https://www.extrawest.com/
