package MyExceptions;

public class NegativeNumberException extends RuntimeException {
    private String message;
    public NegativeNumberException(int num){
        this.message="Negatives not allowed: "+num;
    }
    public String getMessage(){
        return this.message;
    }
}
