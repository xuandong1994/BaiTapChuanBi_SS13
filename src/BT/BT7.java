package BT;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BT7 {
    /**
     * Bài tập 7: Chuyển đổi một chuỗi ngày tháng thành đối tượng LocalDate và in ra ngày tháng.
     * **/
    public static void main(String[] args) {
        String string = "2023-10-04";
        // Định dạng chuỗi ngày tháng
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Chuyển đổi chuỗi thành đối tượng LocalDate
        LocalDate date = LocalDate.parse(string, formatter);

        // In ra ngày tháng
        System.out.println("Ngày tháng: " + date);
    }
}
