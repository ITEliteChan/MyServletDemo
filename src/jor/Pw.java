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
		System.out.println("����Get()����....");
		PrintWriter out =response.getWriter();
		out.append("1.ͨ��this��ȡ��init-param��ʽ: " + this.getInitParameter("name") + "<br>");
		out.append("2.ͨ��getServletConfig()��ȡ�ķ�ʽ: " + this.getServletConfig().getInitParameter("name") + "<br>");
		out.append("3.ͨ��init������ServletConfig������ȡ�ķ�ʽ: " + str + "<br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("��post����");
	}
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		str = config.getInitParameter("name");
	
}
}
