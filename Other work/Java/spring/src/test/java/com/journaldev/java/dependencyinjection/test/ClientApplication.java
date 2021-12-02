package com.journaldev.java.dependencyinjection.test;
 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
import com.journaldev.spring.di.configuration.DIConfiguration;
import com.journaldev.java.dependencyinjection.consumer.MyDIApplication;
 
public class ClientApplication {
 
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		
		app.processMessage("Hi Sumita", "Sumita@abc.com");
		
		//close the context
		context.close();
	}
 
}
