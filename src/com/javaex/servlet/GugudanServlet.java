package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GugudanServlet
 */
@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	

	// 실제 코드 작성 영역
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// parameter 중에 dan 이라는 녀석이 있을 거야. 그 녀석을 꺼내줘.
		// int형 dan변수에 integer안의 parseInt로 형변환 해줘.
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		// 넘기는 값에 한글을 쓰기 위해 준비하는 것.
		response.setContentType("text/html;charset=utf-8");
		
		// html 을 쓰기 위해 준비하는 것.
		PrintWriter out = response.getWriter();		
		
		// html 소스.
		out.println("<table border='1'>");
		out.println("	<colgroup><col width= \"25%\"><col width= \"25%\"><col width= \"50%\"></colgroup>");
		for(int i=1; i<=9; i++) {
			out.println("	<tr><td>"+dan+"</td><td>"+i+"</td><td>"+dan*i+"</td></tr>");
		}
		out.println("</table>");
		
		// http://localhost:8088/helloweb/gugudan?dan=5
			
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
