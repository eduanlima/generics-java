package example_tree.application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(2, 8, 9);
		printList(myInts);
		
		System.out.println("---------------------"); 
		
		List<String> myStrings = Arrays.asList("João, Maria, Joana");
		printList(myStrings);
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
