package com.virtusa.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class JunitTest {

	Junit junit;
	
	@BeforeEach
	public void init() {
		// junit=new Junit();
		 System.out.println("Creating Instance");
	}
	
	
	@Test
	public void test() {
		 junit=new Junit();
		assertEquals(20,junit.add(junit.a, junit.b));
	}

}
