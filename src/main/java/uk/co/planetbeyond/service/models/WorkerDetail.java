package uk.co.planetbeyond.service.models;

public class WorkerDetail
{
	private String workerId;
	private String name;
	private String contactNumber;
	private String experinece;
	private String cnic;
	private String address;
	private String[] skills;

	public WorkerDetail(String workerId, String name, String contactNumber, String experinece, String cnic, String address, String[] skills)
	{
		this.workerId = workerId;
		this.name = name;
		this.contactNumber = contactNumber;
		this.experinece = experinece;
		this.cnic = cnic;
		this.address = address;
		this.skills = skills;
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

	public String getContactNumber()
	{
		return contactNumber;
	}

	public void setContactNumber(String contactNumber)
	{
		this.contactNumber = contactNumber;
	}

	public String getExperinece()
	{
		return experinece;
	}

	public void setExperinece(String experinece)
	{
		this.experinece = experinece;
	}

	public String getCnic()
	{
		return cnic;
	}

	public void setCnic(String cnic)
	{
		this.cnic = cnic;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String[] getSkills()
	{
		return skills;
	}

	public void setSkills(String[] skills)
	{
		this.skills = skills;
	}

}
