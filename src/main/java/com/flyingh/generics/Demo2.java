package com.flyingh.generics;

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

}
