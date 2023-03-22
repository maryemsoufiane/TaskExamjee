package com.estf.TaskExamjee.beans;

import java.util.Random;

public class Task {
	private String Task;
	private String id;
	public Task() {
		super();
		Random r =new Random();
		this.id = r.nextInt(1000000)+"";
	}
	public Task(String task, String id) {
		super();
		Task = task;
		this.id = id;
	}
	public String getTask() {
		return Task;
	}
	public void setTask(String task) {
		Task = task;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}

