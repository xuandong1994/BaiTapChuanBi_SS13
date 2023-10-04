package BT;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BT8 {
    /**
     * Bài tập 8: Tính khoảng cách giữa hai ngày và in ra số ngày đó.
     * **/
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 10, 4);
        LocalDate date2 = LocalDate.of(2023, 10, 10);

        long daysBetween = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Số ngày giữa hai ngày: " + daysBetween);
    }
}
