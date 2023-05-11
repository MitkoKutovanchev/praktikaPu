package lecture3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1L3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		List<String> inputArray = Arrays.asList(input.split(" "));

		inputArray = inputArray.stream().filter(n -> Integer.valueOf(n) > 10 && Integer.valueOf(n) < 20).distinct().limit(2)
				.collect(Collectors.toList());
		
		for (String string : inputArray) {
			System.out.println(string);
		}

	}

}
