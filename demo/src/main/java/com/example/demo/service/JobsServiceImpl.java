package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Jobs;
import com.example.demo.repository.JobsRepository;

@Service
public class JobsServiceImpl implements IJobsService {

	@Autowired
	JobsRepository jobsRepo;
	
	@Override
	public List<Jobs> findAllJobs() {
		// TODO Auto-generated method stub
		Iterable<Jobs> jobs = jobsRepo.findAll();
		System.out.println("in find all jobs"+((jobs.toString())));
		return (List<Jobs>) jobs;
	}

}
