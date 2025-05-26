import java.util.ArrayList;
import java.util.Scanner;

public class Calculator{

    //array to hold the numbers
    double[] numbers;
   
   

    //method to set the numbers using int array
public void setNum(int [] intNumbers){
    this.numbers= new double[intNumbers.length];
    for (int i =0; i < intNumbers.length; i++){
        this.numbers[i] = intNumbers[i];
    }
}

public void setNum(double [] numbers){
    this.numbers= numbers;
    
}

//addition
public void add(){
    double result =0;
    for (double num : this.numbers){
        result = result + num;
    }
    System.out.println("Sum" + result);
}

//subtraction
public void subtract(){
    double result = this.numbers[0];
    for(int i =1; i <this.numbers.length; i++ ){
        result =result - this.numbers[i];
    }
    System.out.println("difference:" + result);
}

//Multiplication
public void multiply(){
    double result = 1;
    for (double num :this.numbers){
        result = result *num;
    }
System.out.println("Multiplication: " + result);
}

//division

public void divide(){
    double result =this.numbers[0];
    for (int i =1; i < this.numbers.length; i++){
        if (this.numbers[i] == 0){
            System.out.println("error : Cant divide by Zero");
            return;
        }
        result = result /this.numbers[i];
    }
    System.out.println("Quotient:" + result);
}
public static void main (String []args){
 Calculator calculator = new Calculator();
 Scanner scanner = new Scanner(System.in);
 

 System.out.println("Enter numbers");
 int count = scanner.nextInt();

 double[] inputNumbers = new double [count];
 for (int i =0; i< count; i++){
    System.out.print("enter number" + (i +1) +" :");
    inputNumbers[i] = scanner.nextDouble();
 }

 calculator.setNum(inputNumbers);

 System.out.println("Choose operation : + - * /");
 char operator = scanner.next().charAt(0);

 //switch statements to handle operations
 switch (operator){

    case '+' :

    //addition
        calculator.add();
        break;

    case '-' :
    //subtraction
        calculator.subtract();
        break;

    case '*' :
    //multiplication
        calculator.multiply();
        break;

        //division
    case '/' :
        calculator.divide();
        break;
 }
 scanner.close();
}

}