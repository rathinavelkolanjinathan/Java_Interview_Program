package org.test.coreJavaprogram.java8.lamdaexpression;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
public class PredicateLanch {
	public static void main(String[] args) {
		Prdicate_Test e1 = new Prdicate_Test(1, 23, "M", "Rick", "Beethovan");
		Prdicate_Test e2 = new Prdicate_Test(2, 13, "F", "Martina", "Hengis");
		Prdicate_Test e3 = new Prdicate_Test(3, 43, "M", "Ricky", "Martin");
		Prdicate_Test e4 = new Prdicate_Test(4, 26, "M", "Jon", "Lowman");
		Prdicate_Test e5 = new Prdicate_Test(5, 19, "F", "Cristine", "Maria");
		Prdicate_Test e6 = new Prdicate_Test(6, 15, "M", "David", "Feezor");
		Prdicate_Test e7 = new Prdicate_Test(7, 68, "F", "Melissa", "Roy");
		Prdicate_Test e8 = new Prdicate_Test(8, 79, "M", "Alex", "Gussin");
		Prdicate_Test e9 = new Prdicate_Test(9, 15, "F", "Neetu", "Singh");
		Prdicate_Test e10 = new Prdicate_Test(10, 45, "M", "Naveen", "Jain");
		ArrayList<Prdicate_Test> list = new ArrayList();
		list.addAll(Arrays.asList(new Prdicate_Test[] { e1, e2, e3, e4, e5, e6, e7, e8, e9, e10 }));
		EmployeePredicates l = new EmployeePredicates();
		System.out.println((l.filterEmployees(list, l.isMale())));
	
	String st="Koollaaaaaaaaaaaaaaaannjji";
	String []aa=st.split("");
	//System.out.println(aa.toString());
	Map<String,Long>map=Arrays.stream(aa).collect(Collectors.groupingBy(c->c,Collectors.counting()));
	
	map.forEach((k,v)->System.out.println(k+"="+v));
	
	
	
	}
}
