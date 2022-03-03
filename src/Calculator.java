import java.util.*;
public class Calculator {
    public static double getSum(double num1, double num2){
        return num1+num2;
    }
    public static double getDif(double num1, double num2){
        return num1-num2;
    }
    public static double getMul(double num1, double num2){
        return num1*num2;
    }
    public static double getDiv(double num1, double num2){
        return num1/num2;
    }
    public static void main(String[] args) {
        int option;
        double num1,num2,answer;
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Hello!!\nWhat is your name ? ");
        name = input.nextLine();
        System.out.println();
        System.out.println("Hello "+name+"!!\nWhat do you want to do ?");
        System.out.println();
        System.out.println("Press 1 for '+'\nPress 2 for '-'\nPress 3 for '*'\nPress 4 for '/'");
        System.out.println();
        System.out.print("Press your option : ");
        option = input.nextInt();
        System.out.println();
        System.out.print("Enter the Number 1 : ");
        num1 = input.nextDouble();
        System.out.print("Enter the Number 2 : ");
        num2 = input.nextDouble();
        System.out.println();
        switch (option){
            case 1 :
                System.out.println("Answer : " + getSum(num1,num2)); break;
            case 2 :
                System.out.println("Answer : " + getDif(num1,num2)); break;
            case 3 :
                System.out.println("Answer : " + getMul(num1,num2)); break;
            case 4 :
                System.out.println("Answer : " + getDiv(num1,num2)); break;
            default:
                System.out.println("Wrong option");
        }
    }
}
