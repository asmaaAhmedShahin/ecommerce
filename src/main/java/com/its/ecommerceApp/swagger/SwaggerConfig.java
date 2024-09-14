package com.its.ecommerceApp.swagger;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import jakarta.servlet.ServletContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
//@EnableSwagger2
public class SwaggerConfig {
	private final static String TITLE = "spring boot project";
	private final static String DESCRIPTION = "spring boot project desc";
	private final static String VERSION = "1.0";
	private final static String TERMS_OF_SERVICE = "Terms of service";
	private final static String CONTACT_User_NAME = "asmaa shahin";
	private final static String CONTACT_User_URL = "";

	private final static String CONTACT_User_EMAIL = "asmaashahin2017@gmail.com";
	private final static String LICENSE = "All rights for asmaa";
	private final static String LICENSE_URL = "";

//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2).groupName("DateTime")
//				.directModelSubstitute(LocalTime.class, String.class)
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("com.musala.bookingEvent.controller"))
//				.paths(PathSelectors.any()).build().apiInfo(apiInfo());
//	}
//
//	private ApiInfo apiInfo() {
//		ApiInfo apiInfo = new ApiInfo(TITLE, DESCRIPTION, VERSION, TERMS_OF_SERVICE,
//				new Contact(CONTACT_User_NAME, CONTACT_User_URL, CONTACT_User_EMAIL),
//                LICENSE, LICENSE_URL);
//		return apiInfo;
//	}
//	
	@Bean
	public OpenAPI openAPI(ServletContext servletContext) {
		Server server = new Server().url(servletContext.getContextPath());
		return new OpenAPI().addSecurityItem(new SecurityRequirement().addList("Bearer Authentication"))
	                .components(new Components().addSecuritySchemes
	                        ("Bearer Authentication", createAPIKeyScheme()))
				.info(new Info().title("REST APIs").description("REST APIs.").version("1.0")
						.contact(new Contact().name("Asmaa Shaheen").email("email").url("email url"))
						.license(new License().name("License of API").url("API license URL")))
				.servers(List.of(server));
	}

	private SecurityScheme createAPIKeyScheme() {
		return new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("https").bearerFormat("JWT").scheme("bearer");
	}
}
