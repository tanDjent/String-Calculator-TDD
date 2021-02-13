import java.util.Scanner;
class StringCalculator{
    public int add(String numbers){
        int sum;
        String n;
        if(numbers.length()==0)return 0;
        Scanner num=new Scanner(numbers);
        num.useDelimiter("[;,\n]");
        sum=0;
        while(num.hasNext()){
            n=num.next();
            if(n.length()==0)continue;
            if(n.charAt(0)<'0' || n.charAt(0)>'9')continue;
            sum+=Integer.parseInt(n);
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

        System.out.println(s.add(a));
        System.out.println(s.add(b));
        System.out.println(s.add(c));
        System.out.println(s.add(d));
        System.out.println(s.add(e));
        System.out.println(s.add(f));
      
    }
}