package javaders.day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Datetime01 {

    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?
        LocalTime myCurrenttime =LocalTime.now();
        System.out.println(myCurrenttime); //21:03:51.227370100

        //Anlik zamanda bilesenler nasil alinir?
       int hour= myCurrenttime.getHour();
        System.out.println(hour);

        int minute = myCurrenttime.getMinute();
        System.out.println(minute);

        int second = myCurrenttime.getSecond();
        System.out.println(second);

        int nano = myCurrenttime.getNano();
        System.out.println(nano);

        //Gelecek ve gecmis zamana nasil gidilir?
        LocalTime next = myCurrenttime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);

        //Zaman formati nasil degistirilir?
        //"HH" -> 24'luk saat sistemi icin "hh" -> 12'lik saat sistemini kullanir.
        //"hh:mm a" ifadesindeki " a" 12'lik saat sisteminde "AM", 'PM" yazilmasini saglar.
        //"ss" saniyeyi gosterir.
        //"mm" "minute" demektir "MM" "month" demektir.
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedMyCurrenttime = dtf1.format(myCurrenttime);
        System.out.println(formattedMyCurrenttime);

        //Date formati nasil degistirilir?
        LocalDate myCurrentDate = LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate); //2022-08-25

        //Tarihi Ay/Gun/Yil sekline ceviriniz.
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate); //08/25/2022

        //Tarihi Gun/Ay isminin ilk 3 harfi/Yil sekline ceviriniz. 25/Aug/25
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);

        //Tarihi gun/Ay ismi/Yil sekline ceviriniz. 25/August/2025
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrentDate3 = dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);

        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //Tokyo da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Tokyo da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);


    }
}
