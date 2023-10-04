package BT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BT10 {
    /**
     * Sắp xếp danh sách các chuỗi theo bảng chữ cái ngược dùng Stream:
     * **/
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","j","c","d","e","f");
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
