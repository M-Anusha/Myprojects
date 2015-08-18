package webservices;

import java.net.MalformedURLException;
import java.net.URL;




import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {

	public static void main(String[] args) throws MalformedURLException {
		URL url=new URL("http://localhost:8083/webservices/greet");
		QName qname=new QName("http://webservices/","HelloWorldImplService");
		Service service=Service.create(url,qname);
		HelloWorld world=service.getPort(HelloWorld.class);
		//System.out.println();
		System.out.println(world.greetings("Anusha"));
		System.out.println(world.add(3,3));
	}

}

