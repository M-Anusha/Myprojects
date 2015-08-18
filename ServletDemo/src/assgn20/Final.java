package assgn20;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * Servlet implementation class Final
 */
@WebServlet("/Final")
public class Final extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Final() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, MalformedURLException{
		URL url=new URL("http://localhost:8090/assgn20/calculation");
		QName qname=new QName("http://assgn20/","BillAmountImplService");
		Service service=Service.create(url,qname);
		BillAmount world=service.getPort(BillAmount.class);
		//System.out.println();
		System.out.println(world.calculate(1000));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
}
