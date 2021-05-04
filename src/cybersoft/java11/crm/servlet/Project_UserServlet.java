package cybersoft.java11.crm.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java11.crm.biz.Project_UserBiz;
import cybersoft.java11.crm.model.Project_User;
@WebServlet(name="Project_UserServlet",urlPatterns = "/puser")
public class Project_UserServlet extends HttpServlet {
	private Project_UserBiz biz;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		biz=new Project_UserBiz();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Project_User> Project_UserList=biz.findall();
		
		for(Project_User PU:Project_UserList)
		{
			resp.getWriter().append(PU.toString());
		}
	}
	
}
