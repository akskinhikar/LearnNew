import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class UnderstandingStreamsAPI {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8,9);
     /*   Stream<Integer> s1 = nums.stream();
        //s1.forEach(n-> System.out.println(n));
        Stream<Integer> s2 = s1.filter(n->n%2==0);
        //s2.forEach(n-> System.out.println(n));
        Stream<Integer> s3 = s2.map(n->n*2);
        //s3.forEach(n-> System.out.println(n));
        int resduce = s3.reduce(0,(c,e)->c+e);
        System.out.println(resduce);
*/

        // the above code can be combined into one line by using streams

        int result = nums.stream()
                .filter(n->n%2==0)
                .map(n->n*2)
                .reduce(0,(c,e)->c+e);
        System.out.println(result);

        int min = nums.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);
        int max = nums.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

    }

}
