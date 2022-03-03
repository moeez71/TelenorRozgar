package uk.co.planetbeyond.service.responsebeans;

public class SavedCandidateResponseBean
{
	private java.util.Date creationTimestamp;
	private Boolean status;
	private String employerMsisdn;
	private String candidateMsisdn;
	private Integer employerSavedCandidateId;

	public java.util.Date getCreationTimestamp()
	{
		return creationTimestamp;
	}

	public void setCreationTimestamp(java.util.Date creationTimestamp)
	{
		this.creationTimestamp = creationTimestamp;
	}

	public Boolean getStatus()
	{
		return status;
	}

	public void setStatus(Boolean status)
	{
		this.status = status;
	}

	public String getEmployerMsisdn()
	{
		return employerMsisdn;
	}

	public void setEmployerMsisdn(String employerMsisdn)
	{
		this.employerMsisdn = employerMsisdn;
	}

	public String getCandidateMsisdn()
	{
		return candidateMsisdn;
	}

	public void setCandidateMsisdn(String candidateMsisdn)
	{
		this.candidateMsisdn = candidateMsisdn;
	}

	public Integer getEmployerSavedCandidateId()
	{
		return employerSavedCandidateId;
	}

	public void setEmployerSavedCandidateId(Integer employerSavedCandidateId)
	{
		this.employerSavedCandidateId = employerSavedCandidateId;
	}

}
