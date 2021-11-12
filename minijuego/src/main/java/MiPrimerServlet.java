

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MiPrimerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		System.out.println("Has llamado a mi servlet desde :" + req.getLocalAddr());
		
		resp.getWriter().print("<h1> +"+Calendar.getInstance().get(Calendar.SECOND) +"</h1>");
	
	}
	
	
	
	

}
