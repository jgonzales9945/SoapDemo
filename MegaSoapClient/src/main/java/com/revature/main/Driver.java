package com.revature.main;

import java.io.PrintWriter;
import java.util.List;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.revature.model.MegaSoap;
import com.revature.service.*;

public class Driver {

	public static void main(String[] args) {
	
		
	String serviceUrl = "http://Megasoap-env2.umccmahrws.us-east-2.elasticbeanstalk.com/mega";
	//set up our factory to create our service	
	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
	factory.setServiceClass(MegaService.class);
	factory.setAddress(serviceUrl);
	
	//set up interceptors to log our incoming and outgoing soap messages
	LoggingInInterceptor inInterceptor = new LoggingInInterceptor();
	LoggingOutInterceptor outInterceptor = new LoggingOutInterceptor();
	factory.getInInterceptors().add(inInterceptor);
	factory.getOutInterceptors().add(outInterceptor);
	inInterceptor.setPrintWriter(new PrintWriter(System.out));
	outInterceptor.setPrintWriter(new PrintWriter(System.out));
	
	MegaService roll = (MegaService) factory.create();
	List<MegaSoap> bookList = roll.getAllMegas();
	for(MegaSoap b: bookList) {
		System.out.println(b);
	}
	
	MegaSoap newMega = new MegaSoap("Gutmans", "Power Punch", 100);
	try {
		System.out.println(roll.addMega(newMega));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//	roll.notRealMethod();

	
	try {
		roll.fight(newMega);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	}

}
