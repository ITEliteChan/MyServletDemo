package myServletDemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlst")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接受请求信息
		String userName=request.getParameter("userName");
		String userpass=request.getParameter("userpass");
		//去数据库查询是否存在该用户
		if("zhangsan".equals(userName)&&"123".equals(userpass)){
			//登陆成功 跳转主页 请求转发:能够携带参数到页面
			request.getRequestDispatcher("home.heml").forward(request, response);
		}else {
			//登陆失败  留在登录页面
			response.sendRedirect("login.html");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
