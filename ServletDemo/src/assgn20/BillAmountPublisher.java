package assgn20;

import javax.xml.ws.Endpoint;

public class BillAmountPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8090/assgn20/calculation", new BillAmountImpl());

	}

}

