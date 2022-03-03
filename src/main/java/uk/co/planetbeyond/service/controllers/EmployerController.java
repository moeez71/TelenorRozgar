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
import uk.co.planetbeyond.service.models.EmployerFeaturedWorker;
import uk.co.planetbeyond.service.models.EmployerJobDetail;
import uk.co.planetbeyond.service.models.WorkerDetail;
import uk.co.planetbeyond.service.models.WorkerFeaturedJob;

@RestController
@RequestMapping("/employer")
public class EmployerController
{

	private static Logger log = LoggerFactory.getLogger(EmployerController.class);

	@GetMapping("/hello")
	public String hello()
	{
		log.info("hello");

		return "employer hello";
	}

	@GetMapping("/featured_workers")
	public ResponseEntity<Object> getFeaturedJobs()
	{
		String[] chips = { "Full-Time" };

		List<EmployerFeaturedWorker> worker = new ArrayList<>(Arrays.asList(new EmployerFeaturedWorker("2", "John Doe", "3", chips, "Islamabad")));
		return ResponseHandler.generateResponse("Success", HttpStatus.OK, worker);

	}

	@GetMapping("/worker_detail")
	public ResponseEntity<Object> getWorkerDetail(@RequestParam("worker_id") Integer workerId)
	{
		String[] skills = { "Electrician", "Plumber" };

		List<WorkerDetail> workerDetail = new ArrayList<>(Arrays.asList(new WorkerDetail(workerId.toString(), "john Doe", "03458590000", "3-4 Years", "xxxxxxxxxxxxxxx", "Islamabad", skills)));
		return ResponseHandler.generateResponse("Success", HttpStatus.OK, workerDetail);

	}

	@GetMapping("/my_jobs")
	public ResponseEntity<Object> getMyJobs(@RequestParam("user_id") Integer user_id)
	{
		String[] chips = { "Full-Time" };

		List<WorkerFeaturedJob> jobs = new ArrayList<>(Arrays.asList(new WorkerFeaturedJob("1", "Electrician", "Walmart Inc.", chips, "California, USA", "$1400-2000"), new WorkerFeaturedJob("2", "Electrician", "Walmart Inc.", chips, "California, USA", "$1400-2000"), new WorkerFeaturedJob("3", "Electrician", "Walmart Inc.", chips, "California, USA", "$1400-2000")));
		return ResponseHandler.generateResponse("Success", HttpStatus.OK, jobs);
	}

	@GetMapping("/saved_workers")
	public ResponseEntity<Object> getSavedWorkers(@RequestParam("user_id") Integer user_id)
	{
		String[] chips = { "Full-Time" };

		List<EmployerFeaturedWorker> worker = new ArrayList<>(Arrays.asList(new EmployerFeaturedWorker("1", "John Doe", "3", chips, "Islamabad")));
		return ResponseHandler.generateResponse("Success", HttpStatus.OK, worker);

	}

	@GetMapping("/job_detail")
	public ResponseEntity<Object> getJobDetail(@RequestParam("job_id") Integer jobId)
	{
		String[] chips = { "Full-Time", "Senior" };

		EmployerJobDetail job = new EmployerJobDetail(jobId.toString(), "Electrician", "Adecor IT Solution", chips, "3-5", "Islamabad", "1300-1400",
				"Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur consectetur adipiscing elit. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequt. Duis aute irure dolor in reprehenderit in voluptate velites cillum dolore eu fugiat nulla pariatur.",
				30, 60);

		return ResponseHandler.generateResponse("Success", HttpStatus.OK, job);

	}

	public ResponseEntity<Object> postJob(@RequestParam("job_id") Integer jobId)
	{
		return ResponseHandler.generateResponse("Success", HttpStatus.OK, null);
	}

}
