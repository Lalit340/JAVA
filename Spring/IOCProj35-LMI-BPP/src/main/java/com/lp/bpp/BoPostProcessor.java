package com.lp.bpp;

import java.util.Date;

import org.springframework.beans.factory.config.BeanPostProcessor;

import com.lp.bo.BeanBo;

public class BoPostProcessor implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization(Object bean,String bid) {
	    System.out.println("BoPostProcessor.postProcessBeforeInitialization()");
	    
	    if(bean instanceof BeanBo) {
	    	((BeanBo) bean).setDoj(new Date());
	    }
		return   bean;
	}

	public Object postProcessAfterInitialization(Object bean,String bid) {
		System.out.println("BoPostProcessor.postProcessAfterInitialization()");
		return   bean;
	}
}
