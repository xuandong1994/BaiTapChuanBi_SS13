package BT;

import java.util.Arrays;
import java.util.List;

public class BT1 {
    //Bài tập 1: Tính tổng của các số chẵn từ một danh sách số nguyên.
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        double test = list.stream().filter(a->a%2 ==0).reduce(0, Integer::sum);
        System.out.println("Tổng các số chẵn là: " + test);
    }
}
