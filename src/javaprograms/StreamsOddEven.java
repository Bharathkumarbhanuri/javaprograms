package javaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsOddEven {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(0,1,2,3,4,5,6,7,8);
		Map<Object, List<Integer>> numbersByOddEven = numbers.stream()
				.collect(Collectors.groupingBy(n -> n%2==0 ? "even": "odd"));
		System.out.println(numbersByOddEven);
	}

}
