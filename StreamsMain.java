package comparable;

import java.util.Arrays;
import java.util.List;

public class StreamsMain {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 2, 2, 4, 7, 9, 11, 44, 23, 12, 12, 34);
		System.out
				.println("********************************Before stream operation:***********************************");
		System.out.println(numbers);

		List<Integer> result = numbers.stream().distinct().filter(n -> n % 2 == 0).map(n -> n * n).toList();

		System.out
				.println("********************************After stream operation:************************************");
		System.out.println(result);
	}
}
