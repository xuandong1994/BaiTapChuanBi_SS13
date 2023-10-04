package BT;

import java.time.LocalDate;

public class BT6 {
    //Bài tập 6: Tính tuổi của một người từ năm sinh.
    public static void main(String[] args) {
       int year = 1981;
        LocalDate today = LocalDate.now();
        int age = today.getYear() - year;
        System.out.println("Số tuổi : " + age);
    }
}
