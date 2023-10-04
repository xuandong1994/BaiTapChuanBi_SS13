package BT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BT11 {
    /**
     *
     * Cho một danh sách các chuỗi,
     * hãy sử dụng Stream để sắp xếp chúng theo thứ tự bảng chữ cái ngược (từ Z đến A).**/
    public static void main(String[] args) {
        List<String> list = Arrays.asList("b","d","c","n","m","f");
        List<String> test = list.stream().sorted(String::compareTo).toList();
        System.out.println("Chuỗi sắp xếp là :" + test);

    }
}
