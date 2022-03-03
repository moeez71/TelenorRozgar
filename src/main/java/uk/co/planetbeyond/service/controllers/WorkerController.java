package uk.co.planetbeyond.service.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uk.co.planetbeyond.service.callback.ResponseHandler;
import uk.co.planetbeyond.service.models.WorkerFeaturedJob;
import uk.co.planetbeyond.service.models.WorkerJobDetail;

@RestController
@RequestMapping("/worker")
public class WorkerController
{
	private static Logger log = LoggerFactory.getLogger(WorkerController.class);

	@GetMapping("/hello")
	public String hello()
	{
		log.info("hello");

		return "worker hello";
	}

	@GetMapping("/job_detail")
	public ResponseEntity<Object> getJobDetail(@RequestParam("job_id") Integer jobId)
	{
		String[] chips = { "Full-Time", "Senior" };

		WorkerJobDetail job = new WorkerJobDetail(jobId.toString(), "Electrician", "Adecor IT Solution", chips, "3-5", "Islamabad", "1300-1400",
				"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur consectetur adipiscing elit. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequt. Duis aute irure dolor in reprehenderit in voluptate velites cillum dolore eu fugiat nulla pariatur.");

		return ResponseHandler.generateResponse("Success", HttpStatus.OK, job);

	}

	@GetMapping("/featured_jobs")
	public ResponseEntity<Object> getFeaturedJobs()
	{
		String[] chips = { "Full-Time" };

		List<WorkerFeaturedJob> jobs = new ArrayList<>(Arrays.asList(new WorkerFeaturedJob("1", "Electrician", "Walmart Inc.", chips, "California, USA", "$1400-2000"), new WorkerFeaturedJob("1", "Electrician", "Walmart Inc.", chips, "California, USA", "$1400-2000"), new WorkerFeaturedJob("1", "Electrician", "Walmart Inc.", chips, "California, USA", "$1400-2000")));
		return ResponseHandler.generateResponse("Success", HttpStatus.OK, jobs);

	}

	@GetMapping("/my_jobs")
	public ResponseEntity<Object> getMyJobs(@RequestParam("user_id") Integer user_id)
	{
		String[] chips = { "Full-Time" };

		List<WorkerFeaturedJob> jobs = new ArrayList<>(Arrays.asList(new WorkerFeaturedJob("1", "Electrician", "Walmart Inc.", chips, "California, USA", "$1400-2000"), new WorkerFeaturedJob("1", "Electrician", "Walmart Inc.", chips, "California, USA", "$1400-2000"), new WorkerFeaturedJob("1", "Electrician", "Walmart Inc.", chips, "California, USA", "$1400-2000")));
		return ResponseHandler.generateResponse("Success", HttpStatus.OK, jobs);

	}

	@GetMapping("/saved_jobs")
	public ResponseEntity<Object> getSavedJobs(@RequestParam("user_id") Integer user_id)
	{
		String[] chips = { "Full-Time" };

		List<WorkerFeaturedJob> jobs = new ArrayList<>(Arrays.asList(new WorkerFeaturedJob("1", "Electrician", "Walmart Inc.", chips, "California, USA", "$1400-2000"), new WorkerFeaturedJob("1", "Electrician", "Walmart Inc.", chips, "California, USA", "$1400-2000"), new WorkerFeaturedJob("1", "Electrician", "Walmart Inc.", chips, "California, USA", "$1400-2000")));
		return ResponseHandler.generateResponse("Success", HttpStatus.OK, jobs);

	}

}
