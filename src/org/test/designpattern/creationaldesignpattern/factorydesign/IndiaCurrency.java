package org.test.designpattern.creationaldesignpattern.factorydesign;

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
