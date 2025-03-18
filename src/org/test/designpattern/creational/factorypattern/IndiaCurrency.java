package org.test.designpattern.creational.factorypattern;

public class IndiaCurrency implements Factory {

	@Override
	public String getCurrency() {
		return "Indian Rupee";
	}

	@Override
	public String getSymbol() {
		return "RS";
	}
}
