package com.baeldung.Spring.Scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	public void testApp() throws InterruptedException {
	    AnnotationConfigApplicationContext context 
	      = new AnnotationConfigApplicationContext(AppConfig.class);
	     
	    SingletonBean firstSingleton = context.getBean(SingletonBean.class);
	    PrototypeBean firstPrototype = firstSingleton.getPrototypeBean();
	     
	    // get singleton bean instance one more time
	    SingletonBean secondSingleton = context.getBean(SingletonBean.class);
	    PrototypeBean secondPrototype = secondSingleton.getPrototypeBean();
	 if(firstPrototype.equals(secondPrototype)) {
		 System.out.println("Both instances of prototype bean are equal");
	 }
	    assertEquals(firstPrototype.equals(secondPrototype), "The same instance should be returned");
	}
}
