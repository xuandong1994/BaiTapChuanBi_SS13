package BT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BT4 {
    /**
     * Bài tập 4: Sắp xếp danh sách số nguyên theo thứ tự giảm dần và lấy 3 phần tử đầu tiên.
     * ***/
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(2,3,5,7,9,1,4,6,8);
        list.stream().sorted(Comparator.comparingInt(a -> (int) a).reversed()).limit(3).forEach(System.out::println);
    }
}
