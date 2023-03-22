package com.estf.TaskExamjee.business;

import java.util.List;
import com.estf.TaskExamjee.beans.Task;
import com.estf.TaskExamjee.dao.TaskDao;
import com.estf.TaskExamjee.dao.TaskDaoMemory;


public class DefaultServices implements Services{

	private static DefaultServices instance = null;
	public static DefaultServices getInstance() {
		if(instance==null)
			instance=new DefaultServices(new TaskDaoMemory());
		return instance;
	}
	
	private TaskDao taskDao;
	private DefaultServices(TaskDao taskDao) {
		this.taskDao=taskDao;
	}
	public Task addTask(Task task) {
		return taskDao.insert(task);
		
	}
	public Task deleteTask(Task task) {
		return taskDao.insert(task);
	}
	public Task getTask(String id) {
		return taskDao.get(id);
		
	}
	public List<Task> getAllTasks() {
		return taskDao.getAll();
	}
	
	
	
	

}