package com.estf.TaskExamjee.business;

import java.util.List;

import com.estf.TaskExamjee.beans.Task;

public interface Services {

	public Task addTask(Task task);
	public Task deleteTask(Task task);
	public  Task getTask(String id);
	public List<Task> getAllTasks();
}