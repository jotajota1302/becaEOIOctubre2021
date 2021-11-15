

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.es.eoi.repository.PersonaRepositoryJPAImpl;

@SuppressWarnings("serial")
public class MiPrimerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		System.out.println("Has llamado a mi servlet desde :" + req.getLocalAddr());
		
		PersonaRepositoryJPAImpl repo= new PersonaRepositoryJPAImpl();
		
		resp.getWriter().print(repo.findById(Integer.valueOf(req.getParameter("id"))).getMail());
	
	}
	

}
