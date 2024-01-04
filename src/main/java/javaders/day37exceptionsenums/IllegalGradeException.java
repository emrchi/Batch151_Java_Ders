package javaders.day37exceptionsenums;

public class IllegalGradeException extends Exception {

    /*
    1)Custom exception Class olusturmak icin Exception Class'a extend etmeliyiz.
    Exception class'a extend ederek olusturdugunuz CustomException "Compile Time Exception" olur.

    2)Custom exception Class olustururken "constructor" olusturmalisiniz.
    Bu "constructor" parent'daki "constructor"i cagirmalidir.
    Bu "constructor" mesaj verecek veya vermeyecek sekilde olusturulabilir.

    3)Custom exception Class olusturdugunuz da ismin sonunda Exception kelimesini kullanmalisiniz.
    IllegalGradeException da oldugu gibi.
     */

    public IllegalGradeException(String message) {
        super(message);
    }

    public IllegalGradeException(){
        super();
    }
}
