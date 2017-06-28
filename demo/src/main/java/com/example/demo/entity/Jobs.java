package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JOBS")
public class Jobs implements Serializable{
  @Id
  
  @Column(name="JOB_ID")
  private String job_id;
  
  @Column(name="JOB_TITLE")
  private String job_title;
  
  @Column(name="MIN_SALARY")
  private double min_salary;
  
  @Column(name="MAX_SALARY")
  private double max_salary;
  
  
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public double getMin_salary() {
		return min_salary;
	}
	public void setMin_salary(double min_salary) {
		this.min_salary = min_salary;
	}
	public double getMax_salary() {
		return max_salary;
	}
	public void setMax_salary(double max_salary) {
		this.max_salary = max_salary;
	}
}
