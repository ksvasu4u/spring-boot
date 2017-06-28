package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Jobs;
import com.example.demo.service.IJobsService;
@RestController
@RequestMapping("/resource")
public class DemoController {
	
	@Autowired
	IJobsService jobsServiceImpl; 
	
	@RequestMapping(method = RequestMethod.GET)
    public String readResource() {
		List<Jobs> alljobs = jobsServiceImpl.findAllJobs();
		for (Jobs job : alljobs) {
			System.out.println(job.getJob_id());
			System.out.println(job.getJob_title());
			System.out.println(job.getMax_salary());
			System.out.println(job.getMin_salary());
		}
        return "hello! easy";
    }
}
