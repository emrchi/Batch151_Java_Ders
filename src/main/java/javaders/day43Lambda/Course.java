package javaders.day43Lambda;

    /*
    Icinde;
    1)Private variable'lar,
    2)Parametreli parametresiz constructor'lar;
    3)Getter'lar
    4)Setter'lar,
    5)toString() method'u
    barindiran class'lara "POJO" Class denir.
    POJO: Plain OLd Java Object
     */

public class Course {

    private String courseName;
    private int numOfStudents;
    private String season;
    private double averageScore;

    //Asagida  kendimiz butun variablelari secerek constroctor olusturduk.

    public Course(String courseName, int numOfStudents, String season, double averageScore) {
        this.courseName = courseName;
        this.numOfStudents = numOfStudents;
        this.season = season;
        this.averageScore = averageScore;
    }

    //Burada yukarida bi constroctor olusturdugumuzda default constroctor silindigi icin default constroctor olusturduk.


    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
