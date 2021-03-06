package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerDocumentationConfig {

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Original Vehicle API v1")
            .description("Mock implementation. OK: V1234567891234567. NOT_FOUND: V1234567891234566. ERROR: V1234567891234568 ")
            .version("1.0.0")
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api"))
                    .build()
                .directModelSubstitute(org.joda.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.joda.time.DateTime.class, java.util.Date.class)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo());
    }

}
