package org.test.coreJavaprogram.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class ListUsingStream {
	private static final Logger logger = Logger.getLogger(ListUsingStream.class.toString());
	public static void main(String[] args) {
		final ListUsingStream co = new ListUsingStream();
		// co=new CountTest(); //The final local variable co cannot be assigned. It must
		// be blank and not using a compound assignment

		logger.info("HashCode::"+co.hashCode());
		// System.out.println(co1.hashCode());
		List list = new ArrayList();
		list.add(21);
		list.add(22);
		list.add(23);


		Stream<Integer> st = list.stream();
		Stream<Integer> ll = st.filter((x) -> x % 2 == 0);
		logger.info("Result::"+ll.count());
	}
}
