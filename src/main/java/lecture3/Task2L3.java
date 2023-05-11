package lecture3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2L3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		List<String> names = Arrays.asList(input.split(" "));

		String charInput = in.nextLine();
		List<String> chars = Arrays.asList(charInput.split(" "));

		names.stream().filter(n -> chars.contains(String.valueOf(n.charAt(0))))
		.sorted().limit(1).forEach(n -> System.out.println(n));

	}

}
