package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe;

import io.swagger.v3.jaxrs2.integration.JaxrsOpenApiContextBuilder;
import io.swagger.v3.oas.integration.OpenApiConfigurationException;
import io.swagger.v3.oas.integration.SwaggerConfiguration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bootstrap extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        Info info = new Info()
                .title("Swagger Server")
                .description("API for evaluating coffee at QAware.");

        ServletContext context = config.getServletContext();
        OpenAPI oas = new OpenAPI().info(info);

        SwaggerConfiguration oasConfig = new SwaggerConfiguration()
                .openAPI(oas)
                .resourcePackages(Stream.of("de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api").collect(Collectors.toSet()));
        try {
            new JaxrsOpenApiContextBuilder()
                    .servletConfig(config)
                    //.ctxId(config.getServletName())
                    .openApiConfiguration(oasConfig)
                    .buildContext(true);
        } catch (OpenApiConfigurationException e) {
            throw new ServletException(e.getMessage(), e);
        }

    }
}
