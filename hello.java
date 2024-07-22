// class hello{
//     public static void main(String[] args) {
//         int a=90;
//         int b=700;
//         int c=45;
//         int d=a+b+c;
//         System.out.println(d);
//     }
// }

import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        String name=scan1.nextLine();
        int d=a+b;
        System.out.println(d);
        System.out.println(d+name);

    }
}