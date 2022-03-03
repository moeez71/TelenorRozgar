package uk.co.planetbeyond.service;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@EnableSwagger2WebMvc
@SpringBootApplication
public class TelenorRozgarAppEngineApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(TelenorRozgarAppEngineApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration()
	{
		// Return a prepared Docket Instance

		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any()).build().apiInfo(apiDetails());

	}

	private ApiInfo apiDetails()
	{

		return new ApiInfo("Rozgar", "Api Documentation", "1.0", "Rozgar", new springfox.documentation.service.Contact("", "", ""), "", "", Collections.emptyList());
	}
}
