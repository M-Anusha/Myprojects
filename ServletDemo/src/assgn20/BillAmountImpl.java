package assgn20;

import javax.jws.WebService;

@WebService(endpointInterface="assgn20.BillAmount")
public class BillAmountImpl implements BillAmount {

	@Override
	public int calculate(int amount) {
		int a=(int) (amount*0.5);
		return a;
	}

}
