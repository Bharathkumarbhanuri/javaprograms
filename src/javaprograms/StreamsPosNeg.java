package javaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsPosNeg {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(-2,-1,0,1,2,3,4,5,-5,6,7,8);
		Map<Object, List<Integer>> numbersByposneg = numbers.stream()
				.collect(Collectors.groupingBy(n -> n>0 ? "pos": "neg"));
		System.out.println(numbersByposneg);
	}
}
