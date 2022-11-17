package com.bitswilp.scalableservices.bedavailabiltyquery.infrastructure;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

import static com.bitswilp.scalableservices.commonlibrary.constants.URLs.BED_AVAILABILITY_PORT;

@Component
public class ServerPortCustomizer
        implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {

    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        factory.setPort(BED_AVAILABILITY_PORT);
    }
}