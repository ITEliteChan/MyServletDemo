package myServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 * Servlet implementation class MyServlet1
 */
public class MyServlet1 extends HttpServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		System.out.println("����service����");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("����servlet");
		
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("servlet��ʼ��");
	}

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req,resp);
		System.out.println("����Get()����....");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html;charset=utf-8");
		out.println("<strong>Hello</strong><br>");
		out.println("<strong>Servlet</strong>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("����Post()����....");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html;charset=utf-8");
		out.println("<strong>Hello</strong><br>");
		out.println("<strong>Servlet</strong>");
		//��ȡ��ʼ������
		String name=this.getInitParameter("name");
		String pass=this.getInitParameter("password");
		System.out.println(name);
		System.out.println(pass);
		
		//��ȡ��ʼ���������������ַ�ʽ
		
		
		
		//����������Ϣ
		
		//��������Ϣ���д����ж�
		
		//���ݴ���Ľ��������Ӧ
	}

}
