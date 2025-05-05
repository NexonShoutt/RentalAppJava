package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class InputValidator {
    public static boolean validasiPlat(String plat) {
        return plat.matches("[A-Z]{1,2}\\s\\d{1,4}\\s[A-Z]{1,3}");
    }

    public static LocalDate validasiTanggal(String input) {
        try {
            return LocalDate.parse(input);
        } catch (DateTimeParseException e) {
            System.out.println("Format tanggal salah. Gunakan yyyy-mm-dd.");
            return null;
        }
    }
}
