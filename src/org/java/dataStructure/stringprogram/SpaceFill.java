package org.java.dataStructure.stringprogram;
import java.util.Arrays;

public class SpaceFill {
	//public final int i;
	/*
	 * public static void main(String[] args) { String st="hello java independent";
	 * 
	 * st=st.replaceAll("\\s", "-");
	 * 
	 * System.out.println(st);
	 * 
	 * }
	 */

public static void main(String [] args ) throws Exception {
    int arr[]={10,20,30,40};
    int size=arr.length;
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int result=arr[size-4];
    System.out.println(result);
    
    

}
}