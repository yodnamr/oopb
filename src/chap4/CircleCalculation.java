package chap4;

import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {
        int menu = 0;
        Circle cc;
        do {            
            System.out.println("--- Menu ---");
            System.out.println("0 : Exit");
            System.out.println("1 : เส้นผ่าศูนย์กลาง");
            System.out.println("2 : เส้นรอบวง");
            System.out.println("3 : พื้นที่");
            System.out.println("4 : ทั้งหมด");
            System.out.println("-------------");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter menu : ");
            menu = sc.nextInt();
            System.out.println("menu = " + menu);            
            switch(menu){
                case 1 :
                    System.out.print("Enter radius : ");
                    double radius = sc.nextDouble();
                    cc = new Circle(radius);
                    System.out.println("รอบวง : "+Math.floor( cc.computeCircumference() ));
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
            }
        } while (menu > 0);
    }
}
