package com.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.task.entities.Task;
import com.task.services.TaskServices;

@Controller
public class TaskController {
	   @Autowired
	   private TaskServices taskservices;
	   // http:localhost:8080/createtask
	   @GetMapping("/createtask")
       public String CreateTask() {
    	   return "create_task";
       }
	   @PostMapping("/savetask")
	   public String SaveTask(Task task,ModelMap model) {
		   taskservices.savetask(task);
		   model.addAttribute("msg", "Your task is saved!!");
		   return "create_task";
	   }
	   
	// http:localhost:8080/getalltask
	   @GetMapping("/getalltask")
	   public String GetAllTask(ModelMap model) {
		   List<Task> alltask=taskservices.getalltask();
		   model.addAttribute("alltask", alltask);
		   return "showall_task";
	   }
	   @RequestMapping("/delete")
	   public String DeleteTask(@RequestParam("id") Long id,ModelMap model) {
		   
		   taskservices.deletetask(id);
		   List<Task> alltask=taskservices.getalltask();
		   model.addAttribute("alltask", alltask);
		   return "showall_task";
	   }
	   @RequestMapping("/update")
	   public String UpdateTaskById(@RequestParam("id")Long id,ModelMap model) {
		   Task task=taskservices.gettaskbyid(id);
		   model.addAttribute("task", task);
		   return "update_task";
	   }
	   @RequestMapping("/updatetask")
	   public String Updatetask(Task task,ModelMap model) {
		   taskservices.savetask(task);
		   List<Task> alltask=taskservices.getalltask();
		   model.addAttribute("alltask", alltask);
		   return "showall_task";
		   
	   }
	  // http://localhost:8080/dataById/2
	   @GetMapping("/dataById/{id}")
	   public String findByid(@PathVariable("id")Long id,ModelMap model) {
		   Task task =taskservices.gettaskbyid(id);
		   model.addAttribute("task", task);
		return "TaskBy_id";
		   
	   }

	   
}
