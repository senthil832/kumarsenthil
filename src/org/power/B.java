package org.power;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class B {
	@Test
	public void test1() {
		Assert.assertTrue("test1 in B", false);
	}
	@Test
	public void test2() {
		Assert.assertTrue("test2 in B", false);
	}
	@Ignore
	@Test
	public void test3() {
		Assert.assertTrue("test3 in B", false);
	}
	@Test
	public void test4() {
		Assert.assertTrue("test4 in B", true);
	}
}
