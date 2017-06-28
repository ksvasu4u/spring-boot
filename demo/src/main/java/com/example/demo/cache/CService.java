package com.example.demo.cache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Jobs;
import com.example.demo.service.IJobsService;
@Service
public class CService {
	@Autowired
	private IJobsService jobsServiceImpl; 
	public List<Jobs> getALLJobs(){
		List<Jobs> alljobs = jobsServiceImpl.findAllJobs();
		return alljobs;
	}
	
	
}
