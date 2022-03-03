package uk.co.planetbeyond.service.models;

public class WorkerFeaturedJob
{

	private String jobId;
	private String title;
	private String companyName;
	private String[] chips;
	private String address;
	private String salary;

	public WorkerFeaturedJob(String jobId, String title, String companyName, String[] chips, String address, String salary)
	{
		this.jobId = jobId;
		this.title = title;
		this.companyName = companyName;
		this.chips = chips;
		this.address = address;
		this.salary = salary;
	}

	public String getJobId()
	{
		return jobId;
	}

	public void setJobId(String jobId)
	{
		this.jobId = jobId;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getCompanyName()
	{
		return companyName;
	}

	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}

	public String[] getChips()
	{
		return chips;
	}

	public void setChips(String[] chips)
	{
		this.chips = chips;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getSalary()
	{
		return salary;
	}

	public void setSalary(String salary)
	{
		this.salary = salary;
	}

}
