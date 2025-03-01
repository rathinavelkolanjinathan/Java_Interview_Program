package org.test.coreJavaprogram.java8.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class Distinct {
	public static void main(String[] args) {
		List<Integer>  l=new ArrayList();
		l.add(5);
		l.add(5);
		l.add(4);
		l.add(4);
		l.add(5);
		l.add(3);
		l.add(3);		
		Stream<Integer> s=l.stream();

		 s.distinct().forEach(a->System.out.println(a));
		
		/*
		 * Stream<Integer>ss=s.distinct();
		 * 
		 * Object[] obj=ss.toArray(); for(Object o:obj) {
		 * 
		 * System.out.println(o); }
		 */
		/*
		 * Stream<Integer>limit=s.limit(3); Object[] ob=limit.toArray(); for(Object
		 * o:ob) {
		 * 
		 * System.out.println(o); }
		 */
		
		
		 long finalVal=l.stream()
				 .distinct()
				 .limit(4)
				 .peek((x)->{System.out.println(x*x);})
				 .count();
		 System.out.println(finalVal);
		
	}
	
}
