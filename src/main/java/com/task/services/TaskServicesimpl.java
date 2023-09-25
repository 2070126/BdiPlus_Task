package com.task.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.entities.Task;
import com.task.repository.TaskRepository;

@Service
public class TaskServicesimpl implements TaskServices {
    @Autowired
	private TaskRepository taskrepo;
	
	@Override
	public void savetask(Task task) {
		taskrepo.save(task);
	}
	@Override
	public List<Task> getalltask() {
		List<Task> alltask=taskrepo.findAll();
		return alltask;
	}
	@Override
	public void deletetask(Long id) {
		taskrepo.deleteById(id);
		
	}
	@Override
	public Task gettaskbyid(Long id) {
	Optional<Task> onetask=taskrepo.findById(id);
	Task task=onetask.get();
	return task;
		
	}
	
	

	
}
