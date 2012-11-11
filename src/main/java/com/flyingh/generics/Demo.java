package com.flyingh.generics;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Demo {

	@Test
	public void test2() {
		List<Integer> list = Arrays.asList();
		System.out.println(list);
		List<? extends Object> list2 = Arrays.<Object> asList(1, "a");
		for (Object obj : list2) {
			System.out.println(obj);
		}
	}

	@Test
	public void test() {
		String integerCacheHighPropValue = sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
		System.out.println(integerCacheHighPropValue);
		System.out.println(Math.exp(1));
		System.out.println(Math.log(Math.E));
		System.out.println(Math.log(Math.exp(2)));
		System.out.println(Math.cbrt(8));
	}
}
