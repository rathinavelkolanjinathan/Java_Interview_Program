package org.test.coreJavaprogram.collection;



import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Logger;

public class HashTableVSHashMap {
	private static final Logger logger = Logger.getLogger(HashTableVSHashMap.class.toString());
	public static void main(String[] args) {

		// Creating Hashtable object
		Hashtable<Integer, String> hashtable = new Hashtable<>();

		// Adding entry to Hashtable
		// Custom input entries
		hashtable.put(65, "A");
		hashtable.put(65, "C");
		hashtable.put(67, "C");
		hashtable.put(68, "D");
		//hashtable.put(69,null);    *null not allowed
		//hashtable.put(null,null);  *null not allowed


		//Check synchronized or not
		Method[] methods = java.util.Hashtable.class.getDeclaredMethods();
		for (Method method : methods) {
			if ((method.getModifiers() & java.lang.reflect.Modifier.SYNCHRONIZED) != 0) {
				System.out.println("Hashtable Method Name... "+method.getName() + "....is synchronized.");
			}
		}

		// Print and display the HashTable elements
		logger.info("Hashtable Value .... "+hashtable);


		Map<String,String> map = new HashMap<>();

		// Creating a synchronized Map
		Map<String, String> synchronizedMap = Collections.synchronizedMap(map);

		synchronizedMap.put("Key1","kolanji");
		synchronizedMap.put("Film","veera");
		synchronizedMap.put("addres","12 56");
		//map.put(null,"hello"); // not allowed
		synchronizedMap.put("hai",null);
		synchronizedMap.put(null,null);
		//Collections.synchronizedMap(map);

		//Check synchronized or not
		Method[] methods1 = java.util.HashMap.class.getDeclaredMethods();
		for (Method method : methods1) {
			if ((method.getModifiers() & java.lang.reflect.Modifier.SYNCHRONIZED) != 0) {
				System.out.println("Map Method Name...."+method.getName() + " is synchronized.");
			}
		}

		map.forEach((key,value)-> System.out.println("Key"+key +"=="+value));

	}
}
