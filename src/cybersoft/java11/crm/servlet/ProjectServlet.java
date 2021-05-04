package cybersoft.java11.crm.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java11.crm.biz.ProjectBiz;
import cybersoft.java11.crm.model.Project;
@WebServlet(name="project",urlPatterns = "/project")
public class ProjectServlet extends HttpServlet {
	private ProjectBiz Biz;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		Biz=new ProjectBiz();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Project> projectList=Biz.findALL();
		
		for(Project pr:projectList)
		{
			resp.getWriter().append(pr.toString());
		}
	}
}
