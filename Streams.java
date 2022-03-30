import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Filter {

	public static void main(String[] args) {
System.out.println("ramram");
//1
//IntStream.range(1, 10).forEach(System.out::print);
//IntStream.range(1, 10).forEach(x->System.out.print(x));
System.out.println();
//1	
//IntStream.range(1, 10).skip(5).	forEach(System.out::print);	
//3
//System.out.println(IntStream.range(1, 10).sum());
//4
//Stream.of("zabc","def").sorted().findFirst().ifPresent(System.out::print);

//5

String names[]= {"zabc","daef","ghi","dbef","jkl","mno"};
//Arrays.stream(names).filter(x->x.startsWith("d")).sorted().forEach(System.out::println);
//Arrays.stream(names).filter(x->x.startsWith("d")).filter(x->x.contains("e")  ).sorted().forEach(System.out::println);


//6


Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9,10}).map(x->x*x).average().ifPresent(System.out::print);

Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9,10}).map(x->x*x).min().ifPresent(System.out::print);

IntStream.range(1, 1000).forEach(System.out::print);
//Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9,10}).map(x->x*x).average().ifPresent(System.out::print);

//7Http method
https://doc.oroinc.com/api/create-update-related-resources/
		
//8
Actuator-->Monitoring

	}

}
