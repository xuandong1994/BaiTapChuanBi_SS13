package BT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BT3 {
    /**
     * Bài tập 3: Chuyển đổi một danh sách người thành danh sách tên (đối tượng Person có thuộc tính name).
     * **/
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Đông"));
        list.add(new Person("Nam"));
        list.add(new Person("Xuân"));
        list.add(new Person("Băc"));
        list.stream().map(Person::getName).forEach(System.out::println);

    }
}
