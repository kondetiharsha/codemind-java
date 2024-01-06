import java.util.Scanner;
public class MyClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int d=sc.nextInt();
        int c=s%d;
        System.out.printf("%d",c);
    }
}