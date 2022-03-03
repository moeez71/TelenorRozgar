package uk.co.planetbeyond.service.callback;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler
{
	public static ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object responseObj)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message", message);
		map.put("statusCode", status.value());
		map.put("data", responseObj);

		/*
		 * if (status.value() != HttpStatus.OK.value()) {
		 */
		// Map<String, Object> errorMap = new HashMap<String, Object>();
		// errorMap.put("errorMessage", message);
		// errorMap.put("errorCode", status.value());
		// map.put("error", errorMap);
		// }
		return new ResponseEntity<Object>(map, status);

	}
}