package org.java.datastructure.string;

import java.util.*;
import java.util.stream.Collectors;

public final class ImmutableEmployee {

	private final String name;
	private final Date doj;// mutable
	private final List<String> mobile;

	private final Address address;

	public ImmutableEmployee(String name, Date doj, List<String> mobile, Address address) {
	        this.name = name;
	        this.doj = doj;
	        this.mobile = mobile;
	        this.address = address;
	    }

	public String getName() {
		return name;
	}

	public Date getDoj() {
		return (Date) doj.clone();
	}

	public List<String> getMobile() {
		return new ArrayList<>(mobile);
	}

	public Address getAddress() {
		return new Address(address.getCity(), address.getZip());
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", doj=" + doj + ", mobile=" + mobile + ", address=" + address
				+ '}';
	}
	 public static void main(String[] args) {
	        Address address=new Address("blr","1012");
	        ImmutableEmployee employee=new ImmutableEmployee("Basant",new Date(),
	                Arrays.stream(new String[]{"1234","5678"}).collect(Collectors.toList()), address);

	        employee.getDoj().setDate(21);
	        employee.getMobile().add("9010");
	        employee.getAddress().setCity("Pune");

	        System.out.println(employee);


	    }
}
