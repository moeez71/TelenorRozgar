package uk.co.planetbeyond.service.models;

public class EmployerFeaturedWorker
{

	private String workerId;
	private String name;
	private String experience;
	private String[] chips;
	private String address;

	public EmployerFeaturedWorker(String workerId, String name, String experience, String[] chips, String address)
	{
		this.workerId = workerId;
		this.name = name;
		this.experience = experience;
		this.chips = chips;
		this.address = address;
	}

	public String getWorkerId()
	{
		return workerId;
	}

	public void setWorkerId(String workerId)
	{
		this.workerId = workerId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getExperience()
	{
		return experience;
	}

	public void setExperience(String experience)
	{
		this.experience = experience;
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

}
