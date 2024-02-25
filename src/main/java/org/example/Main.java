import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        String nama, birthDay, getGender;
        char gender;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Nama : ");
        nama = userInput.nextLine();

        System.out.print("Jenis Kelamin (L/P) :");
        gender = userInput.next().charAt(0);
        userInput.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd) :");
        birthDay = userInput.nextLine();

        String[] parts = birthDay.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        LocalDate calculate = LocalDate.of(year, month, day);
        int calYears = Period.between(calculate, today).getYears();
        int calMonths = (calYears > 0) ? Period.between(calculate, today).getMonths() : 0;

        getGender = (gender == 'P') ? "Perempuan" : "Laki-Laki";
        System.out.println("Nama : " + nama + "\nJenis Kelamin: " + getGender + "\nUmur Anda : " + calYears + " tahun " + calMonths + " bulan");
    }
}