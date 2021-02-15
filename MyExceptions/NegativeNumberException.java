package MyExceptions;
import java.util.ArrayList;
public class NegativeNumberException extends RuntimeException {
    private String message;
    public NegativeNumberException(int num){
        this.message="Negatives not allowed: "+num;
    }
    public NegativeNumberException(ArrayList<Integer> negativeNumbers){
        this.message="Negatives not allowed: ";
        for (Integer integer : negativeNumbers) {
                this.message=this.message+integer+" ";            
        }
    }
    public String getMessage(){
        return this.message;
    }
}
