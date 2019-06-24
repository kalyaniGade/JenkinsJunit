package com.virtusa.jenkins;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

public class JunitTest {

	Junit junit;
	
	@BeforeEach
	public void init() {
	   junit=new Junit();
		 System.out.println("Creating Instance");
	}
	
	@AfterEach
	void cleanUp() {
		System.out.println("Cleaning Up...");
	}
	
	@Test
	@DisplayName("Testing  Add method")
	public void test() {
		 junit=new Junit();
		assertEquals(20,junit.add(junit.a, junit.b));
	}
	@Test
	@DisplayName("Testing  Add method")
	public void test1() {
		 junit=new Junit();
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
