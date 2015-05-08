import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class ShowPost
 */
public class ShowPost extends HttpServlet 
{
   PrintWriter p;
   
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	  	p=response.getWriter();
	  	p.print("<html>");
	  	p.print("<body>");
	  	p.print("From Post Method");
	  	p.print("</body>");
	  	p.print("</html>");
	}

}
