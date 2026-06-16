package Javaprogram;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
//        List<Integer> list1 = List.of(2,4,44,21,98);
//        System.out.println(list1);
//
//        //List<Integer> list2 = new ArrayList<>();     Methods to make streams
//
//        //List<Integer> list = Arrays.asList(10,20,30);
//        //Stream<Integer> stream = list1.stream();
//        List<Integer> newList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println("Even Numbers are:" + newList);
//
//        List<Integer> newList1 = list1.stream().filter(i -> i >10 ).collect(Collectors.toList());
//        System.out.println("Even Numbers are:" + newList1);






        // STREAM OBJECTS
//        String names[] = {"Rahul","Gopal","Ajay","Ankit"};
//        Stream<String> stream1 = Stream.of(names);
//        stream1.forEach(e -> {
//            System.out.println(e);
//        });
//
//       // LIST ,SET
//       List<Integer> list2 = new ArrayList<>();
//        list2.add(21);
//        list2.add(25);
//        list2.add(94);
//        list2.add(68);
//        list2.add(98);
//        //System.out.println(list2);
//
//        Stream<Integer> stream2 = list2.stream();
//        stream2.forEach(x->{
//            System.out.println(x);
//        });
      //  stream2.forEach(System.out::println);   // Method refrence


        //METHODS
        //      FILTER(take predicate)   predicate take boolean value function

        List<String> names = List.of("Aman","Ankit","Bhuvnesh","Abhinash","Gopal");
        List<String> newnames = names.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
        System.out.println(newnames);



        //MAP
        List<Integer> numbers = List.of(2,4,44,21,98);
        List<Integer> newnumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newnumbers);




        //SORTED
        numbers.stream().sorted().forEach(System.out:: println);


        Integer integer = numbers.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("Minimum:"+ integer);

        Integer integer1 = numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Minimum:"+ integer1);
    }
}
