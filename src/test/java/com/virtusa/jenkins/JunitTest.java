package com.virtusa.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest {

	@Test
	public void test() {
		Junit junit=new Junit();
		assertEquals(26,junit.add(junit.a, junit.b) );
	}

}
