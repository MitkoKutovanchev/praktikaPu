package lecture2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Task6L2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        List<String> inputArray = Arrays.asList(input.split(", "));
        
        List<String> listNew = new ArrayList<>();
        listNew.addAll(inputArray);
        
        
        BiFunction<Integer, Integer, Integer> sum = (s1, s2) -> s1 + s2;
        
        
        while (listNew.size() > 1) {
        	listNew.set(0, String.valueOf(
        			sum.apply(Integer.valueOf(listNew.get(0)), Integer.valueOf(listNew.get(1)))
        			));
        	
        	listNew.remove(1);
		}
        
        System.out.println(listNew.get(0));
	}
}
