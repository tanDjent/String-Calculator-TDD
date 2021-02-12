class StringCalculator{
    public int add(String numbers){
        int sum,i,beginning;
        if(numbers.length()==0)return 0;
        i=0;
        sum=0;
        beginning=0;
        while(i<numbers.length()){
            if(numbers.charAt(i)==','||numbers.charAt(i)=='\n'){
                sum+=Integer.parseInt(numbers.substring(beginning,i));
                beginning=i+1;
            }
            ++i;
        }
        sum+=Integer.parseInt(numbers.substring(beginning,i));
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
    
        System.out.println(s.add(a));
        System.out.println(s.add(b));
        System.out.println(s.add(c));
        System.out.println(s.add(d));
        System.out.println(s.add(e));
    }
}