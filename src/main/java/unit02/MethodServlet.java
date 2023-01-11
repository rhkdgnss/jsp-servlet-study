package unit02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/unit02/MethodServlet")
public class MethodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MethodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		//출력 스트림인 printwriter객체를 HttpServletResponse 객체의 getWriter()메소드로부터 얻어냄
		PrintWriter out = response.getWriter();
		out.print("<h1>get방식 처리</h1>");
		out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//출력 스트림인 PrintWriter 객체를 HttpServletResponse 객체의 getWriter() 메소드로부터 얻어냄
		PrintWriter out = response.getWriter();
		out.print("<h1>post방식 처리</h1>");
		out.close();
	}

}
