package uk.co.planetbeyond.service.models;

public class EmployerJobDetail
{
	private String jobId;
	private String title;
	private String companyName;
	private String[] chips;
	private String experience;
	private String address;
	private String salary;
	private String description;
	private int noOfApplicants;
	private int totalViews;

	public EmployerJobDetail(String jobId, String title, String companyName, String[] chips, String experience, String address, String salary, String description, int noOfApplicants, int totalViews)
	{
		this.jobId = jobId;
		this.title = title;
		this.companyName = companyName;
		this.chips = chips;
		this.experience = experience;
		this.address = address;
		this.salary = salary;
		this.description = description;
		this.noOfApplicants = noOfApplicants;
		this.totalViews = totalViews;
	}

	public String getjobId()
	{
		return jobId;
	}

	public void setjobId(String jobId)
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

	public String getExperience()
	{
		return experience;
	}

	public void setExperience(String experience)
	{
		this.experience = experience;
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

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public int getNoOfApplicants()
	{
		return noOfApplicants;
	}

	public void setNoOfApplicants(int noOfApplicants)
	{
		this.noOfApplicants = noOfApplicants;
	}

	public int getTotalViews()
	{
		return totalViews;
	}

	public void setTotalViews(int totalViews)
	{
		this.totalViews = totalViews;
	}

}
