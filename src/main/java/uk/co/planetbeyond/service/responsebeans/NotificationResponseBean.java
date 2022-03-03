package uk.co.planetbeyond.service.responsebeans;

public class NotificationResponseBean
{
	private java.util.Date scheduledTimestamp;
	private java.util.Date broadcastTimestamp;
	private Boolean status;
	private java.util.Date creationTimestamp;
	private String notificationMessage;
	private String notificationTitle;
	private Integer notificationId;

	public java.util.Date getScheduledTimestamp()
	{
		return scheduledTimestamp;
	}

	public void setScheduledTimestamp(java.util.Date scheduledTimestamp)
	{
		this.scheduledTimestamp = scheduledTimestamp;
	}

	public java.util.Date getBroadcastTimestamp()
	{
		return broadcastTimestamp;
	}

	public void setBroadcastTimestamp(java.util.Date broadcastTimestamp)
	{
		this.broadcastTimestamp = broadcastTimestamp;
	}

	public Boolean getStatus()
	{
		return status;
	}

	public void setStatus(Boolean status)
	{
		this.status = status;
	}

	public java.util.Date getCreationTimestamp()
	{
		return creationTimestamp;
	}

	public void setCreationTimestamp(java.util.Date creationTimestamp)
	{
		this.creationTimestamp = creationTimestamp;
	}

	public String getNotificationMessage()
	{
		return notificationMessage;
	}

	public void setNotificationMessage(String notificationMessage)
	{
		this.notificationMessage = notificationMessage;
	}

	public String getNotificationTitle()
	{
		return notificationTitle;
	}

	public void setNotificationTitle(String notificationTitle)
	{
		this.notificationTitle = notificationTitle;
	}

	public Integer getNotificationId()
	{
		return notificationId;
	}

	public void setNotificationId(Integer notificationId)
	{
		this.notificationId = notificationId;
	}

}
