package fr.abes.theses.diffusion.utils;

import org.apache.coyote.ProtocolHandler;
import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

/**
 * Classe ajoutée pour pouvoir accepter plus de 100 headers (qui sont envoyés par la fédération d'identité RENATER)
 */
@Component
public class TomcatCustomizer implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

    @Override
    public void customize(TomcatServletWebServerFactory server) {
        server.addConnectorCustomizers((connector) -> {
            ProtocolHandler handler = connector.getProtocolHandler();
            AbstractHttp11Protocol protocol = (AbstractHttp11Protocol) handler;
            protocol.setMaxHeaderCount(500);

        });
    }

}
