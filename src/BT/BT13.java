package BT;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BT13 {
    // bài 13 : Cho một danh sách các số nguyên, hãy sử dụng Stream để tính tổng của tất cả các số chia hết cho 3.
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,7,9,12,2,4,6,8);
        List<Integer> test = list.stream().filter(a->a % 3 ==0).toList();
        System.out.println("Số chia hết cho 3 là : " + test);
        test.stream().sorted().forEach(System.out::println);
    }
}
