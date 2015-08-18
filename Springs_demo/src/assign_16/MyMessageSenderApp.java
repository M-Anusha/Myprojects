package assign_16;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;



public class MyMessageSenderApp
{
	public static void main(String[] args)
	{
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("assign_16/SpringAnn.xml"));
		MyMessageSender mymessagesender= (MyMessageSender) factory.getBean("mymessagesender");
		mymessagesender.first();
	}

}



