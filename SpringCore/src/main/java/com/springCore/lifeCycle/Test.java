package com.springCore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/lifeCycle/lifeconfig.xml");
//    Kaju k1=(Kaju) context.getBean("k1");
//    
//       System.out.println(k1);
//       
//      //       registering shutdown hook
       context.registerShutdownHook();
//      Kishmis k2 =(Kishmis) context.getBean("k2");
//      System.out.println(k2);
      
      Example example=(Example) context.getBean("example");
      System.out.println(example);
}
}
