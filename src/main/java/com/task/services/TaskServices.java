package com.task.services;

import java.util.List;

import com.task.entities.Task;



public interface TaskServices {

	void savetask(Task task);

	List<Task> getalltask();

	void deletetask(Long id);

	Task gettaskbyid(Long id);

	

	

	

}
