package com.cts.training.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.bean.IPO;
import com.cts.training.dao.IPODAO;

public class IpoUnitTest {
	
	private AnnotationConfigApplicationContext context;
	
	@Autowired
	private IPODAO ipoDAO;
	
	private IPO ipo;

}
