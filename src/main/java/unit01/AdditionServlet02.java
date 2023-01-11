package unit01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdditionServlet02
 */
@WebServlet("/AdditionServlet02")
public class AdditionServlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    public AdditionServlet02() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 = 12;
		int num2 = 13;
		int add = num1+ num2;
		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		request.setAttribute("add", add);
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("addition02.jsp");
		dispatcher.forward(request,response);
	}

}
