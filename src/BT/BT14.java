package BT;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BT14 {
    /**
     *
     * bài 14 : Tìm các số nguyên đầu tiên trong danh sách lớn hơn một giá trị cụ thể
     * **/
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 7, 1, 9, 6, 4);
        int value = 2;
        Optional<Integer> test = numbers.stream().filter(a-> a > value).findFirst();
        System.out.println("Số nguyên đầu tiên lớn hơn " + value + " là :" + test.get());
    }
}
