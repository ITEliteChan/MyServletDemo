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
		//����������Ϣ
		String userName=request.getParameter("userName");
		String userpass=request.getParameter("userpass");
		//ȥ���ݿ��ѯ�Ƿ���ڸ��û�
		if("zhangsan".equals(userName)&&"123".equals(userpass)){
			//��½�ɹ� ��ת��ҳ ����ת��:�ܹ�Я��������ҳ��
			request.getRequestDispatcher("home.heml").forward(request, response);
		}else {
			//��½ʧ��  ���ڵ�¼ҳ��
			response.sendRedirect("login.html");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
