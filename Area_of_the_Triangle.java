import java.util.*;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       float a=sc.nextFloat();
       float b=sc.nextFloat();
       float c=sc.nextFloat();
       float s=(a+b+c)/2;
       float v=s*(s-a)*(s-b)*(s-c);
       
       System.out.printf("%.2f",Math.sqrt(v));
    }
}