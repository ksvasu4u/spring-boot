package com.example.demo.vo;

import java.io.Serializable;

public class LabelValueVO implements Serializable{
	public String labelCode;
	public String labelDescrption;
	public String getLabelCode() {
		return labelCode;
	}
	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}
	public String getLabelDescrption() {
		return labelDescrption;
	}
	public void setLabelDescrption(String labelDescrption) {
		this.labelDescrption = labelDescrption;
	}
}
