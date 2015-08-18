package webservices;

import javax.jws.WebService;

@WebService(endpointInterface="webservices.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String greetings(String name) {
	return "Hello"+name;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
