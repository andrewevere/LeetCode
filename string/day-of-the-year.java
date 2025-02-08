import java.time.Year;

public class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int y = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int d = Integer.parseInt(parts[2]);

        if ((y % 400 == 0 || (y % 100 != 0 && y % 4 == 0)) && m > 2) {
            d += 1;
        }

        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 1; i < m; i++) {
            d += months[i - 1];
        }

        return d;
    }
}