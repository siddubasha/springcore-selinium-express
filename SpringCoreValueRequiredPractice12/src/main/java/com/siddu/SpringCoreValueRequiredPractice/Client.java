package com.siddu.SpringCoreValueRequiredPractice;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) throws Exception {
		
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	
    	JDBCConnection jdbcCon=context.getBean("jdbcConnection",JDBCConnection.class);
    	
    	jdbcCon.display();
    	jdbcCon.getJDBCConnection();
	}
}  
