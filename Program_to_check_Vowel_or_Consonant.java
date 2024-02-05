import java.util.*;
public class M{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int y=(int)c;
        if(y==97||y==101||y==105||y==111||y==117||y==65||y==69||y==73||y==79||y==85)
   {
       System.out.print("Vowel");
   } 
        else{
            System.out.print("Consonant ");
        }
    }
}