package com.estf.TaskExamjee.dao;

import java.util.List;
import java.util.Vector;

import com.estf.TaskExamjee.beans.Task;
public class TaskDaoMemory implements TaskDao{

	private List<Task> tasks;
	private int lastIndex=0;
	public TaskDaoMemory() {
		tasks=new Vector<Task>();
		insert(new Task("hello meryem","1"));
		insert(new Task("tasks","2"));
	}
	@Override
	public Task insert(Task task) {
		lastIndex++;
		task.setId(lastIndex+"");
		tasks.add(task);
		return task;
	}

	
	

	@Override
	public Task delete(Task task ) {
		Task element=get(task.getId());
		if(element==null)
			return null;
		
		tasks.remove(element);
		return element;
	}

	@Override
	public Task get(String id) {
		for(Task element:tasks)
			if(element.getId().equals(id))
				return element;
		return null;
	}

	@Override
	public List<Task> getAll() {
		return tasks;
	}

}