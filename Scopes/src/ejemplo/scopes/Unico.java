package ejemplo.scopes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Unico
 */
@WebServlet("/Unico")
public class Unico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Unico() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if (null!=request.getAttribute("edad"))
			request.setAttribute("edad", (int)request.getAttribute("edad")+1);
		else request.setAttribute("edad", 1);
		
		HttpSession session =  request.getSession(true);
		
		if (null!=session.getAttribute("edad"))
			session.setAttribute("edad", (int)session.getAttribute("edad")+1);
		else session.setAttribute("edad", 1);
		
		
		if (null!=getServletContext().getAttribute("edad"))
			getServletContext().setAttribute("edad", (int) getServletContext().getAttribute("edad") +1);
		else getServletContext().setAttribute("edad", 1);
		
		request.getRequestDispatcher("salida.jsp").forward(request, response);
		
	}

}
