import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    System.out.print("Plese input the year:");
    int year=scan.nextInt();
    if(year%4==0 && year%100!=0){
       System.out.print("Congratulation! It's the leap year!");
    }else 
    if(year%400==0){
        System.out.print("Congratulation! It's the leap year!");
    }else
    {
        System.out.print("Sorry,It's not the leap year.");
    }   
    scan.close();
}
}
