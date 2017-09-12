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
		System.out.println("调用service方法");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("销毁servlet");
		
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("servlet初始化");
	}

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req,resp);
		System.out.println("处理Get()请求....");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html;charset=utf-8");
		out.println("<strong>Hello</strong><br>");
		out.println("<strong>Servlet</strong>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("处理Post()请求....");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html;charset=utf-8");
		out.println("<strong>Hello</strong><br>");
		out.println("<strong>Servlet</strong>");
		//获取初始化参数
		String name=this.getInitParameter("name");
		String pass=this.getInitParameter("password");
		System.out.println(name);
		System.out.println(pass);
		
		//获取初始化参数的另外两种方式
		
		
		
		//接受请求信息
		
		//对请求信息进行处理判断
		
		//根据处理的结果进行响应
	}

}
