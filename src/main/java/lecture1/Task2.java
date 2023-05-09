package lecture1;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
	
	public static void main(String[] args) {
		String equasion = "1 + (2 - (2 + 3) * 4 / (3 + 1)) *5";
		
		int firstIndex = equasion.indexOf('(');
		int lastIndex = equasion.lastIndexOf(')');
		
		equasion = equasion.substring(firstIndex, lastIndex);
		
		List splits = new ArrayList<>();
		splits.add(equasion);
		
		Pattern regex = Pattern.compile("\\(([^()]*)\\)");
		Matcher regexMatcher = regex.matcher(equasion);

		while (regexMatcher.find()) {
			splits.add(regexMatcher.group(1));
		}
		
		splits.stream().forEach(s -> System.out.println(s));
		
	}
}
