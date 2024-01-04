package javaders.day37exceptionsenums;

public class IllegalAgeException extends RuntimeException{

    /*
    1)Eger Runtime custom exception uretmek isterseniz RuntimeException class extent edilmelidir
     */

    public IllegalAgeException() {
        super();
    }

    public IllegalAgeException(String   message){
        super(message);
    }

}
