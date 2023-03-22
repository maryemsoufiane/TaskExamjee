package com.estf.TaskExamjee.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estf.TaskExamjee.beans.Task;
import com.estf.TaskExamjee.business.DefaultServices;


@WebServlet("/addTask")
public class AddTaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	private String task;
	    public AddTaskServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/addTask.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String taskName = request.getParameter("task");
		if(taskName.isEmpty()) {
			request.setAttribute("message", "all field are required");
			request.getRequestDispatcher("/WEB-INF/addTask.jsp").forward(request, response);
		}
		else {
			Task task = new Task();
			task.setTask(taskName);
			task = DefaultServices.getInstance().addTask(task);
			if(task == null) {
				request.setAttribute("message", "please try again later");
				request.getRequestDispatcher("/WEB-INF/addTask.jsp").forward(request, response);		
			}
			else {
				response.sendRedirect("listTask");
			}
		}
	}
	}

