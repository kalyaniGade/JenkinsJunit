package com.virtusa.jenkins;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Tag;

public class JunitTest {

	Junit junit;
	
	@Before
	public void init() {
	   junit=new Junit();
		 System.out.println("Creating Instance");
	}
	
	@After
	public void cleanUp() {
		System.out.println("Cleaning Up...");
	}
	
	@Test
	public void test() {
		
		assertEquals(20,junit.add(junit.a, junit.b));
	}
	
	@Ignore
	@Test
	public void test1() {
		
		assertEquals(20,junit.add(junit.a, junit.b));
	}
	
	@Tag("slow")
    @Test
    public void testAddMaxInteger() {
        assertEquals(2147483646, Integer.sum(2147183646, 300000));
    }
	
	@Tag("fast")
	@Test
	public void divException() {
		 assertThrows(ArithmeticException.class, () -> {
		        Integer.divideUnsigned(10, 0);
		    });        
	}
		
	
	
	

}
