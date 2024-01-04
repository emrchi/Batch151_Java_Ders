package javaders.day20arraylistsdatetime;

import java.time.*;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        //Icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate); //2023-03-15

        //Tarihten istedigimiz bileseni nasil aliriz?
        int mounthValue = myCurrentDate.getMonthValue();
        System.out.println(mounthValue); //3
        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue); //15
        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue); //2023

        //Asagida ki Month ve DayOfWeek bir "Enum"dir.
        //Programlama dillerinde sabit degerler "Enum"larin icine depolanir.
        //Sabit degerler==> Ay isimleri,Gun isimleri, Ulkedeki sehir isimleri v.s.
        Month mounthName = myCurrentDate.getMonth();
        System.out.println(mounthName); //MARCH

        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName); //WEDNESDAY

        //Ileriki tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4)); //2023-03-20

        //Gecmis tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusYears(30).minusMonths(2).minusDays(18)); //1992-12-28

        //spesifik bir tarih objesi nasil olusturulur?
        LocalDate gokhanDob = LocalDate.of(1986,6,10);
        LocalDate fatihDob = LocalDate.of(1985,2,25);

        //Bir tarihin bir tarih'ten sonra olup olmadigi nasil kontrol edilir?
        boolean r1 = gokhanDob.isAfter(fatihDob);
        System.out.println(r1); //true
        //Bir tarihin bir tarih'ten once olup olmadigi nasil kontrol edilir?
        boolean r2 = fatihDob.isBefore(gokhanDob);
        System.out.println(r2); //true
        //Bir tarihin bir tarih'e esit olup olmadigi nasil kontrol edilir?
        boolean r3 = gokhanDob.isEqual(fatihDob);
        System.out.println(r3); //false

        //Ex1.: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //      Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" mesaji veriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Year, mounth and Day numbers in order...");
        int year = input.nextInt();
        int mounth = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year,mounth,day);

        if(givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate + " Invalid date");
        }else{
            System.out.println("Enter time for the ticket");
        }

        int lenghtOfMonth = myCurrentDate.lengthOfMonth();
        System.out.println(lenghtOfMonth); //31

        // Ex2: Kullanicinin girdigi tarihin gun ismini bulan codu yaziniz.

        System.out.println("Please enter Year, mounth and Day numbers in order...");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());

    }
}
