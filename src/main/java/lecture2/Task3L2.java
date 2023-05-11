package lecture2;

import java.util.Random;
import java.util.function.Supplier;

public class Task3L2 {

	public static void main(String[] args) {
		Supplier<Integer> roll = () -> (new Random().nextInt(6)) + 1;
		
		System.out.println(roll.get() + " / " + roll.get());
	}

}
