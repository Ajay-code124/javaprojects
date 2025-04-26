package com.loc_di.I_o_c_DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class IOCDiApplication {

	public static void main(String[] args) {

		//Spring Bean Containers
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobilesConfig.class);
	Mobiles obj =context.getBean("getOneplus", Mobiles.class);
	Mobiles obj2 =context.getBean("getIPhone", Mobiles.class);
	obj.getModelAndColor();
	System.out.println("----------------------------------");
	obj2.getModelAndColor();
	
	}

}
