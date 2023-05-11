package lecture2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1L2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        List<String> inputArray = Arrays.asList(input.split(","));
        
        FuncInterface findEven = s -> printEven(s);
        FuncInterface findOdd = s -> System.out.println(s + " is odd");
        
        print(inputArray, findEven, findOdd);
        
        SortingFunc sort = l -> l.sort((o1, o2) -> Integer.valueOf(o1).compareTo(Integer.valueOf(o2)));
        
        sort.sort(inputArray);
        
        System.out.println(".............................................................");
        
        print(inputArray, findEven, findOdd);
	}
	
	static void printEven(String s) {
		System.out.println(s + " is even");
	}
	
	static void print (List<String> iputArray, FuncInterface findEven, FuncInterface findOdd) {
		for (String string : iputArray) {
			if (Integer.valueOf(string) % 2 == 0) {
				findEven.find(string);
			} else {
				findOdd.find(string);
			}
		}
	}
	
}

interface FuncInterface {
	void find(String s);
}

interface SortingFunc {
	void sort(List<String> list);
}
