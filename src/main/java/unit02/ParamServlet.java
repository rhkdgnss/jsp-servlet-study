package unit02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		//사용자가 폼에 입력한 값을 서블릿에서 얻어오는 법
		String id = request.getParameter("id");
		int age = Integer.parseInt(request.getParameter("age"));
		
		PrintWriter out = response.getWriter();		
		out.print("<html><body>");
		out.println("당신이 입력한 정보.<br>");
		out.println("이름: ");
		out.println(id);
		out.println("<br>나이: ");
		out.println(age);
		//자바 스크립트로 이전페이지로 이동하는 링크만들어줌
		out.println("<br><a href='javascript:history.go(-1)'>다시 </a>");
		out.print("</body></html>");
		out.close();
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//post 방식으로 넘어올때 한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
