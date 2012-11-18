package com.flyingh.generics;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Demo {
	@Test
	public void test5(){
		Method[] methods = Integer.class.getMethods();
		for (Method method : methods) {
			if("compareTo".equals(method.getName())){
				System.out.println(method.toGenericString());
			}
		}
		System.out.println(Arrays.asList(methods));
		
	}
	
	@Test
	public void test4() {
		List<Object> objs = Arrays.<Object> asList("one", 2, 3.14, 4);
		List<Integer> ints = Arrays.asList(2, 4);
		Assert.assertTrue(objs.contains("one"));
		Assert.assertTrue(objs.containsAll(ints));
	}

	/**
	 * The Get and Put Principle: use an extends wildcard when you only get
	 * values out of a structure, use a super wildcard when you only put values
	 * into a structure, and don’t use a wildcard when you both get and put.
	 */
	@Test
	public void test3() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}

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
		String integerCacheHighPropValue = sun.misc.VM
				.getSavedProperty("java.lang.Integer.IntegerCache.high");
		System.out.println(integerCacheHighPropValue);
		System.out.println(Math.exp(1));
		System.out.println(Math.log(Math.E));
		System.out.println(Math.log(Math.exp(2)));
		System.out.println(Math.cbrt(8));
	}
}
