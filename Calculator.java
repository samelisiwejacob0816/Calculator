
public class Calculator{

    //variables to hold the number
    double num1,num2;
   
   

    //method to set the numbers
public void setNum(double num1, double num2){
    this.num1= num1;
    this.num2= num2;
}


public static void main (String []args){
 Calculator calculator = new Calculator();

 //numbers set manually
 calculator.setNum(10,5);

 //operator set manually
 char operator = '+';

 double result;

 //switch statements to handle operations
 switch (operator){

    case '+' :

    //addition
        result = calculator.num1 + calculator.num2;
        System.out.println(result);
        break;

    case '-' :
    //subtraction
        result = calculator.num1 - calculator.num2;;
        System.out.println(result);
        break;

    case '*' :
    //multiplication
        result =calculator.num1 * calculator.num2;;
        System.out.println(result);
        break;

        //division
    case '/' :
        result = calculator.num1 / calculator.num2;;
        System.out.println(result);
        break;

        
     default : 
     System.out.println("please choose +,-,*,/");
     break;   
 }
}

}