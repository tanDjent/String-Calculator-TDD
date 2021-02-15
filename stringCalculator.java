import java.util.Scanner;
import java.util.ArrayList;
import MyExceptions.NegativeNumberException;
class StringCalculator{
    private int callCount;
    public StringCalculator(){
        this.callCount=0;
    }
    public int add(String numbers){
        this.callCount++;
        int sum,parsedNumber;
        String token;
        ArrayList<Integer> negativeNumbers=new ArrayList<Integer>();
        NegativeNumberException n;
        if(numbers.length()==0)return 0;
        Scanner num=new Scanner(numbers);
        if(numbers.charAt(0)=='/' && numbers.charAt(1)=='/' && numbers.charAt(3)=='\n'){
            num.useDelimiter("["+numbers.charAt(2)+",\n]");
        }
        else num.useDelimiter("[,\n]");
        sum=0;
        while(num.hasNext()){
            token=num.next();
            if(token.length()==0)continue;
            if((token.charAt(0)<'0' || token.charAt(0)>'9') && token.charAt(0)!='-')continue;
            parsedNumber=Integer.parseInt(token);
            if(parsedNumber<0){
                negativeNumbers.add(parsedNumber);
            }
            sum+=parsedNumber;          
         }
        num.close();
        if(negativeNumbers.size()!=0){
            n=new NegativeNumberException(negativeNumbers);
            throw n;
        }
        return sum;
    }
    public int getCalledCount(){
        return this.callCount;
    }
}
class Main{
    public static void main(String gg[]){
        StringCalculator s=new StringCalculator();
        String a="";
        String b="1";
        String c="3,4";
        String d="1,2,3,4,5,6,7,8,9";
        String e="1\n2,3,4\n5";
        String f="//;\n1;2"; 
        String g="1,2,3,-4,5,6,7,8,-9";

       try{ System.out.println(s.add(a));
        System.out.println(s.add(b));
        System.out.println(s.add(c));
        System.out.println(s.add(d));
        System.out.println(s.add(e));
        System.out.println(s.add(f));
        System.out.println("CallCount: "+ s.getCalledCount());
        System.out.println(s.add(g));
        System.out.println("CallCount: "+ s.getCalledCount());
    }catch(NegativeNumberException negativeNumberException){
        System.out.println(negativeNumberException.getMessage());
    }
      
    }
}