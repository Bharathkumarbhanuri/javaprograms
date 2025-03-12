package javaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streamsFirstLetter {
	public static void main(String[] args) {
		List<String> List = Arrays.asList("bharath","naveen","sai","saikiran","bro");
		Map<Character, List<String>> ByFirstLetter = List.stream()
				.collect(Collectors.groupingBy(n -> n.charAt(0)));
		System.out.println(ByFirstLetter);
		Map<Character, Long> ByFirstLetterCount = List.stream()
				.collect(Collectors.groupingBy(n -> n.charAt(0),Collectors.counting()));
		System.out.println(ByFirstLetterCount);
	}
}
