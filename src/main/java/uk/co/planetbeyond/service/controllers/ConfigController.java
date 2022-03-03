package uk.co.planetbeyond.service.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import uk.co.planetbeyond.service.callback.ErrorResponseHandler;
import uk.co.planetbeyond.service.callback.ResponseHandler;
import uk.co.planetbeyond.service.models.Notification;

@RestController
public class ConfigController
{

	private static Logger log = LoggerFactory.getLogger(ConfigController.class);

	@Autowired
	private Environment env;

	private final RestTemplate restTemplate;

	public ConfigController(RestTemplateBuilder restTemplateBuilder)
	{
		this.restTemplate = restTemplateBuilder.build();
	}

	/**
	 * Method to send otp to given number
	 * 
	 * @return
	 */
	@GetMapping("/get_otp")
	@CrossOrigin
	public ResponseEntity<Object> getOtp(@RequestParam(value = "msisdn", required = true) String msisdn, @RequestParam(value = "hash_code", required = true) String hashCode)
	{
		try
		{

			if (hashCode.length() != 11)
			{
				return ErrorResponseHandler.generateResponse("Hash Code Error, Incorrect Format", HttpStatus.MULTI_STATUS, null);
			}

			log.info("Send OTP to MSISDN:", msisdn);

			String url = env.getProperty("CSMS_URL_TO_SEND_SMS_API");

			url = url.replace("#msisdn#", msisdn);
			url = url.replace("#message#", "Your OTP code is: 123ABC78\n" + hashCode);

			String response = this.restTemplate.getForObject(url, String.class);

			log.info("RESPONSE :", response);

			return ResponseHandler.generateResponse("Successfully sent otp request!", HttpStatus.OK, null);
		}
		catch (Exception e)
		{
			log.error("exception occured", e);
			return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.MULTI_STATUS, null);
		}
	}

	@GetMapping("/hello")
	public String hello()
	{
		log.info("hello");

		return "up and running";
	}

	@GetMapping("/error")
	public ResponseEntity<Object> getError()
	{

		return ErrorResponseHandler.generateResponse("SQL Error", HttpStatus.MULTI_STATUS, null);
	}

	@GetMapping("/notification")
	public ResponseEntity<Object> getNotification()
	{

		List<Notification> jobs = new ArrayList<>(Arrays.asList(new Notification("1", "Lorem ipsum dolor", "Lorem ipsum sit amet, consectetur adip iscing elit, sed do eiusmod tempor"), new Notification("2", "Lorem ipsum dolor", "Lorem ipsum sit amet, consectetur adip iscing elit, sed do eiusmod tempor"),
				new Notification("1", "Lorem ipsum dolor", "Lorem ipsum sit amet, consectetur adip iscing elit, sed do eiusmod tempor"), new Notification("4", "Lorem ipsum dolor", "Lorem ipsum sit amet, consectetur adip iscing elit, sed do eiusmod tempor"), new Notification("5", "Lorem ipsum dolor", "Lorem ipsum sit amet, consectetur adip iscing elit, sed do eiusmod tempor")));
		return ResponseHandler.generateResponse("Success", HttpStatus.OK, jobs);
	}

}
