package extrawest.ocpp2_0_1serverexample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class ApplicationConfiguration {

    @Value("${server.port}")
    private Integer serverPort;

    public Integer getServerPort() {
        return serverPort;
    }
}
