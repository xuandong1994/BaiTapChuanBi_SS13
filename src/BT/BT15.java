package BT;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BT15 {
    /**
     * Bài Tập 15:Cho một danh sách các số nguyên lớn, hãy sử dụng Stream để tìm các số đầu tiên lớn hơn một giá trị cụ thể.
     * ***/
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,3,5,6,7,9,2,4,8);
        int value = 5;
        Optional<Integer> list = number.stream().filter(a->a > value).findFirst();
        System.out.println("Số đầu tiên lớn hơn " + value +" là : " + list.get());
    }
}
