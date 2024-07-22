import java.util.Scanner;

public class excercise {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // String name=scanner.nextLine();
        // String address=scanner.nextLine();
        // int age =scanner.nextInt();
        // System.out.println("My name is " +name);
        // System.out.println("My age is " +age);
        // System.out.println("My address is" +address);
        // int a=scanner.nextInt();
        // int b=scanner.nextInt();
        // int c=scanner.nextInt();
        // int d =a*b*c;
        // int e=a+b+c;
        // int f=d/e;
        // System.out.print(f);
        String name=scanner.nextLine();
        int score=scanner.nextInt();
        scanner.nextLine();
        String dept=scanner.nextLine();
        System.out.println("my name is" +name);
        System.out.println("my score is" +(score)/10);
        System.out.print("my department is " +dept);
    }
}
