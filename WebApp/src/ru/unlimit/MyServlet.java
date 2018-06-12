package ru.unlimit;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("firstName");
		String surname = request.getParameter("secondName");
		System.out.println(name);
		System.out.println(surname);
		
		response.setContentType("text/html;charset=utf-8");
		//Чтобы возвращалось в браузере
		PrintWriter out = response.getWriter();
		out.println("<h3>Hello from Myservlet.GET "+name+" "+surname+"</h3>");
		out.close();
	}

}
