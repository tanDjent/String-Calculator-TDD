class StringCalculator{
    public int add(String numbers){
        int a,b,i;
        if(numbers.length()==0)return 0;
        i=0;
        
        while(i<numbers.length()){
            if(numbers.charAt(i)==',')break;
            ++i;
        }
        
        if(i==numbers.length()){
          return Integer.parseInt(numbers);  
        }
        a=Integer.parseInt(numbers.substring(0,i));
        b=Integer.parseInt(numbers.substring(i+1));
        return a+b;
    }
}
class Main{
    public static void main(String gg[]){
        StringCalculator s=new StringCalculator();
        String a="";
        String b="1";
        String c="3,4";
        System.out.println(s.add(a));
        System.out.println(s.add(b));
        System.out.println(s.add(c));
    }
}