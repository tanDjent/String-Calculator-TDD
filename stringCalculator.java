import java.util.Scanner;
import MyExceptions.NegativeNumberException;
class StringCalculator{
    public int add(String numbers){
        int sum,parsedNumber;
        String token;
        if(numbers.length()==0)return 0;
        Scanner num=new Scanner(numbers);
        num.useDelimiter("[;,\n]");
        sum=0;
        while(num.hasNext()){
            token=num.next();
            if(token.length()==0)continue;
            if((token.charAt(0)<'0' || token.charAt(0)>'9') && token.charAt(0)!='-')continue;
            parsedNumber=Integer.parseInt(token);
            if(parsedNumber<0){
                NegativeNumberException n= new NegativeNumberException(parsedNumber);
                num.close();
                throw n;
            }
            sum+=parsedNumber;          
         }
        num.close();
        return sum;
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
        String g="1,2,3,4,5,6,7,8,-9";

       try{ System.out.println(s.add(a));
        System.out.println(s.add(b));
        System.out.println(s.add(c));
        System.out.println(s.add(d));
        System.out.println(s.add(e));
        System.out.println(s.add(f));
        System.out.println(s.add(g));
    }catch(NegativeNumberException negativeNumberException){
        System.out.println(negativeNumberException.getMessage());
    }
      
    }
}