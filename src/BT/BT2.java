package BT;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BT2 {
    /**
     * Bài tập 2: Lọc danh sách chuỗi để chỉ chứa những từ có độ dài lớn hơn 5.
     * **/
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Phạm xuân Đông","Xuân Đông","c","d","e","f");
        String test = list.stream().filter(a->a.length()>5).toList().toString();
        System.out.println(test);
    }
}
