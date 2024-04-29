package fr.abes.theses.diffusion.openapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI usersMicroserviceOpenAPI() {
        return new OpenAPI().servers(Arrays.asList(new Server().url("https://theses.fr")))
                .info(new Info().title("API exportation des métadonnées de theses.fr")
                        .description("Cette API gère la diffusion des fichiers de thèses, en accès libre ou en accès restreint, sur theses.fr.")
                        .version("1.0"));
    }

}
