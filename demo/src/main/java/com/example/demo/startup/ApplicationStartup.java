package com.example.demo.startup;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.example.demo.cache.CService;
import com.example.demo.cache.CacheUtil;
import com.example.demo.entity.Jobs;
import com.example.demo.vo.LabelValueVO;

@Component
public class ApplicationStartup 
implements ApplicationListener<ApplicationReadyEvent> {
	
	@Autowired
	private CService cService;
	
	@Autowired
    private CacheUtil cacheUtil;   
	
 /**
   * This event is executed as late as conceivably possible to indicate that 
   * the application is ready to service requests.
   */
  @Override
  public void onApplicationEvent(final ApplicationReadyEvent event) {
 
    // here your code ...
	 System.out.println("application init");
	   /* System.out.println("cacheService"+cService);
		
		List<Jobs> jobsList = cService.getALLJobs();
		
		LabelValueVO labelValueVO = null;
		List<LabelValueVO> jobsDropdownVOList = new ArrayList<LabelValueVO>();
		for (Jobs job : jobsList) {
			System.out.println(job.toString());
			labelValueVO = new LabelValueVO();
			labelValueVO.setLabelCode(job.getJob_id());
			labelValueVO.setLabelDescrption(job.getJob_title());
			jobsDropdownVOList.add(labelValueVO);
		}
		cacheUtil.setJobsDropDownListVO("JOBS_DROPDOWN","en","US",jobsDropdownVOList);
		List<LabelValueVO> cachejobsDropDownList = cacheUtil.getJobsDropDownListVO("JOBS_DROPDOWN","en","US");
		System.out.println("size"+cachejobsDropDownList.size());*/
    return;
  }
 
}
