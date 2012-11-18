package com.flyingh.generics;

import java.util.List;

class A {
	public CharSequence sayHello(String cs) {
		return cs;
	}
}

class B extends A {
	@Override
	public String sayHello(String cs) {
		return cs;
	}
}

public class Demo2 {
	public void fun(List<Integer> list) {
	}

//	public void fun(List<String> list) {
//	}
}
