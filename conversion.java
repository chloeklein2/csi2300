import java.util.Scanner;

public class conversion {

    public static void main(String[] args) {
        int num;
        float value = 0;
        double result=0;
        try (Scanner scnr = new Scanner(System.in)) {
            while (true) {
                System.out.println("welcome to metric conversions");
                System.out.println("please enter a number for which conversion you would like to do");
                System.out.println("1:km to miles");
                System.out.println("2:miles to km");
                System.out.println("3:pounds to kg");
                System.out.println("4:fahrenheit to celsius");
                System.out.println("input a number or enter 0 to exit:");
                num = scnr.nextInt();
                if (num==0) {
                    break;                
                }
              
                 while (true) {                
                 
                    if (num==1) {
                        System.out.println("please enter how many kilometers:");
                        value=scnr.nextFloat();                    
                        result=value/1.609344;
                        break;                
                    }
                    if (num==2) {
                        System.out.println("please enter how many miles:");
                        value=scnr.nextFloat();                    
                        result=value/.62137;
                        break;                
                    }
                    if (num==3) {
                        System.out.println("please enter how many pounds:");
                        value=scnr.nextFloat();                    
                        result=value/2.2046;
                        break;                
                    }
                    if (num==4) {
                        System.out.println("please enter the temperature in Fahrenheit:");
                        value=scnr.nextFloat();                    
                        result= value-32;
                        result=result/1.8;
                        break;                
                    }
                    
                   
                 }                 
                 System.out.println(result);  

            }
        }
    }
}