package assign_16;

public class MyMessageSender
{
	MessageService messageService;

	public MessageService getMessageService() 
	{
		return messageService;
	}
	public void setMessageService(MessageService messageService) 
	{
		this.messageService = messageService;
	}
	public void first()
	{
		messageService.sendMessage();
		System.out.println("Message is sending");
	}
}
