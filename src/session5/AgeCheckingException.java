package session5;

public class AgeCheckingException extends Exception{
    //đây là exception do chúng ta người dùng tựdđịnh nghĩa
    public AgeCheckingException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "loi nhap so tuoi" + super.getMessage();
    }
}

