package sean.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Settings
 */
// @WebServlet("/Settings")
@WebServlet("/")
public class Settings extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Settings() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head><title>Servlet Settings</title></head>");
        out.println("<body>");
        out.println("<h1>LibertyToOpenShift Testing - InstantOn</h1>");
        out.println("<table border='1'>");
        out.println("<tr><th>Name</th><th>Value</th></tr>");

        out.println("<tr>");
        out.println("<td>Request URL</td>");
        out.println("<td>" + request.getRequestURL() + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Local Name/td>");
        out.println("<td>" + request.getLocalName() + "</td>");
        out.println("</tr>");


        out.println("<tr>");
        out.println("<td>Remote Host/td>");
        out.println("<td>" + request.getRemoteHost() + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Server Name/td>");
        out.println("<td>" + request.getServerName() + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Local addr/td>");
        out.println("<td>" + request.getLocalAddr() + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Remote addr/td>");
        out.println("<td>" + request.getRemoteAddr() + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Local port/td>");
        out.println("<td>" + Integer.toString(request.getLocalPort()) + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Remote port/td>");
        out.println("<td>" + Integer.toString(request.getRemotePort()) + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>Server port/td>");
        out.println("<td>" + Integer.toString(request.getServerPort()) + "</td>");
        out.println("</tr>");

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
