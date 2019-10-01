package chap4;

//import java.util.ArrayList;

import java.util.Scanner;

//import java.util.Scanner;

public class SaleComission {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0; 
        java.util.ArrayList<SaleMan> saleList = new java.util.ArrayList<>();
        do {            
            System.out.println("--- Menu ---");
            System.out.println("0 : Exit");
            System.out.println("1 : ป้อนค่า");
            System.out.println("2 : แสดงผล");
            System.out.println("-------------");        
            
            System.out.print("Enter menu : ");
            menu = sc.nextInt();
            switch(menu){
                case 1 : 
                    System.out.print("Enter ID : ");
                    String id = sc.next();
                    System.out.print("Enter Name : ");
                    String name = sc.next();
                    System.out.print("Enter Surname : ");
                    String surname = sc.next();
                    System.out.print("Enter Sale Class : ");
                    int saleClass = sc.nextInt();
                    System.out.print("Enter Sale Total : ");
                    double saleTotal = sc.nextDouble();                    
                    
                    SaleMan sm = new SaleMan();
                    sm.setId(id);
                    sm.setName(name);
                    sm.setSurname(surname);
                    sm.setSaleClass(saleClass);
                    sm.setSaleTotal(saleTotal);
                    saleList.add(sm);
                    break;
                case 2 : 
                    for (int i = 0; i < saleList.size(); i++) {
                        SaleMan sObj = saleList.get(i);
                        System.out.println("---------------------------");
                        System.out.println("ID : "+sObj.getId());
                        System.out.println("Name : "+sObj.getName());
                        System.out.println("Surname : "+sObj.getSurname());
                        System.out.println("Class : "+sObj.getSaleClass());
                        System.out.println("Total : "+sObj.getSaleTotal());
                        System.out.println("---------------------------");
                    }
                    break;
            }
        } while (menu != 0);

    }
}
