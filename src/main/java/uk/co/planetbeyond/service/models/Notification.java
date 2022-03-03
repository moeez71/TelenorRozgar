package uk.co.planetbeyond.service.models;

public class Notification
{

	private String notificationId;
	private String title;
	private String description;

	public Notification(String notificationId, String title, String description)
	{
		this.notificationId = notificationId;
		this.title = title;
		this.description = description;
	}

	public String getNotificationId()
	{
		return notificationId;
	}

	public void setNotificationId(String notificationId)
	{
		this.notificationId = notificationId;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

}
