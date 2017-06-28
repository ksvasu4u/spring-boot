package com.example.demo.cache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.vo.LabelValueVO;
@Component
public class CacheUtil {
   
   @Autowired
   
   private ICManager cManager;
   
   public void setJobsDropDownListVO(String dropDownConstant,String languageCd, String CountryCd,List<LabelValueVO>jobsDropdownVOList){
	   String key = getKey(dropDownConstant,languageCd,CountryCd);		   
	   cManager.addCacheEntry(key,jobsDropdownVOList);
   }

   private String getKey(String dropDownConstant, String languageCd, String countryCd) {
	// TODO Auto-generated method stub
	   StringBuilder cacheKey = new StringBuilder();
       cacheKey.append(dropDownConstant).append(languageCd).append(countryCd);
       return cacheKey.toString();
	
   }
   
   public List<LabelValueVO> getJobsDropDownListVO(String dropDownConstant,String languageCd, String CountryCd){
	   String key = getKey(dropDownConstant,languageCd,CountryCd);		   
	   List<LabelValueVO> jobsDropsDownList= (List<LabelValueVO>)cManager.getCacheEntry(key);
	   System.out.println("in the cache"+jobsDropsDownList.size());
	   return jobsDropsDownList;
   }
   
}
