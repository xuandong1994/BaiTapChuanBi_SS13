package BT;

import java.util.Arrays;
import java.util.List;

public class BT9 {
    /**Bài tập 9: Cho một danh sách các số nguyên, hãy sử dụng Stream để đếm số lượng phần tử  lớn hơn 10.
     *
     * **/
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(100,1,11,32,44,2,5,6,14,30,22);
        list.stream().filter(a->a>10).limit(10).forEach(System.out::println);
    }
}
