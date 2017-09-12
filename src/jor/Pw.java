package jor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Pw extends HttpServlet {
	
       String str;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		System.out.println("处理Get()请求....");
		PrintWriter out =response.getWriter();
		out.append("1.通过this获取的init-param方式: " + this.getInitParameter("name") + "<br>");
		out.append("2.通过getServletConfig()获取的方式: " + this.getServletConfig().getInitParameter("name") + "<br>");
		out.append("3.通过init方法的ServletConfig参数获取的方式: " + str + "<br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("用post传递");
	}
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		str = config.getInitParameter("name");
	
}
}
