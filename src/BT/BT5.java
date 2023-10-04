package BT;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BT5 {
    /**
     * Bài tập 5: In ra ngày và giờ hiện tại theo định dạng yyyy-MM-dd HH:mm:ss.
     *
     * */
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss ");

        String formattedDateTime = localDateTime.format(dateTimeFormatter);

        System.out.println("Ngày và giờ " + formattedDateTime);
    }
}
