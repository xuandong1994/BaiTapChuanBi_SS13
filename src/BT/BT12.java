package BT;

import java.util.Arrays;
import java.util.List;

public class BT12 {
    /** Bài tập 12 : Tính tổng của các số chia hết cho 3 trong danh sách:**/
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,6,9,8,4);
        double test = list.stream().filter(a->a % 3== 0).reduce(0, Integer::sum);
        System.out.println("Tổng cái số chia hê cho 3  là: " + test);
    }
}
