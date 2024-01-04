package javaders.day43Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        Course turkishDay = new Course("Turkish Daytime QA", 213, "Spring", 97 );
        Course turkishNight = new Course("Turkish Nighttime QA", 245, "Winter", 98);
        Course englishDay = new Course("English Daytime Java Dev",121, "Spring", 91);
        Course englishNight = new Course("English Nighttime Java Dev",137, "Winter", 95);

        List<Course> courseList = new ArrayList<>();
        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(englishNight);

        System.out.println(isAvarageScoreGraterThanANumber(courseList, 90)); //true
        System.out.println(isAnyCourseNameContainsQa(courseList, "QA")); //true
        System.out.println(getCourseNameHasAvgMax(courseList)); //Turkish Nighttime QA
        System.out.println(getcourseBetterThanLastTwo(courseList)); //[Course{courseName='Turkish Daytime QA', numOfStudents=213, season='Spring', averageScore=97.0}, Course{courseName='Turkish Nighttime QA', numOfStudents=245, season='Winter', averageScore=98.0}]
        System.out.println(getHighestThird(courseList)); //Course{courseName='English Nighttime Java Dev', numOfStudents=137, season='Winter', averageScore=95.0}
        System.out.println(getCourseWhoseRegisteredStdLessThanANumber(courseList,150)); //[Course{courseName='English Daytime Java Dev', numOfStudents=121, season='Spring', averageScore=91.0}, Course{courseName='English Nighttime Java Dev', numOfStudents=137, season='Winter', averageScore=95.0}]

    }

    //Ex1: Tum average score'larin 90 dan buyuk olup olmadigini kontrol eden method'u olusturunuz.

    public static boolean isAvarageScoreGraterThanANumber(List<Course> courseList, int avg){
        return courseList.stream().allMatch(t->t.getAverageScore()>avg);

    }

    //Ex 2: En az bir kurs isminin QA icerip icermedigini  kontrol eden method'u olusturunuz.

    public static boolean isAnyCourseNameContainsQa(List<Course> courseList, String word) {
        return courseList.stream().anyMatch(t -> t.getCourseName().contains(word));
    }
    //Ex 3: En yuksek avarage score'a sahip course ismini veren methodu yaziniz.

    public static String getCourseNameHasAvgMax(List<Course> courseList){
        return courseList.stream().sorted(Comparator.comparing(Course ::getAverageScore).reversed()).findFirst().get().getCourseName();
        //Burada listemizi avarage score'a gore sort methodu ile siraladik ve sonra reversed methodu ile max avg basta olmasi icin ters
        //cevirdik.sonra findFirst methodu ile ilk objeyi aldik ve oradan getCourseName ile ismini cektik.
    }
    //Ex 4: Avarage score'u en dusuk olan ilk iki course disindaki tum kurslari return eden methodu olusturunuz.

    public static List<Course> getcourseBetterThanLastTwo(List<Course> courseList){
        return courseList.
                stream().
                sorted(Comparator.comparing(Course ::getAverageScore)).
                skip(2).
                collect(Collectors.toList());
    }
    //Ex 5: Avarage score'u ustten 3. olan kursu veren method'u olusturunuz.


    public static Course getHighestThird(List<Course> courseList){
        return courseList.
                stream().
                sorted(Comparator.comparing(Course ::getAverageScore).reversed()).
                skip(2). // ters cevrilen stream de ilk ikisini es gec
                limit(1). //geri kalanlarin ilkini al
                collect(Collectors.toList()). //stream i listeye cevir
                get(0); //listedekinin ilkini al getir
    }
    //Ex 6:  Ogrenci sayisi 150'den az olan kurslari return eden mehod'u olusturunuz.

    public static List<Course> getCourseWhoseRegisteredStdLessThanANumber(List<Course> courseList, int numOfStd){
       return courseList.stream().filter(t-> t.getNumOfStudents()<numOfStd).collect(Collectors.toList());
    }
}
