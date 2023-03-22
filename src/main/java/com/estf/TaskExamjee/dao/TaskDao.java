package com.estf.TaskExamjee.dao;

import java.util.List;

import com.estf.TaskExamjee.beans.Task;

public interface TaskDao {
	public Task insert(Task task);
	public Task delete(Task task);
	public Task get(String id);
	public List<Task> getAll();

}