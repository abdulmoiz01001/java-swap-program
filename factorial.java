import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        int givenNumber ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate a Factorial: ");
        givenNumber = sc.nextInt();
        int factorial = calculateFactorial.factorial(givenNumber);
        System.out.println("Factorial of "+givenNumber+" is "+factorial);
      
    }
}

 class calculateFactorial{
    public static int factorial(int givenNumber){
       
        int factorial = 1;
        for(int i = givenNumber; i>1; i-- ){
            if(i==0){
        
                return 1;
            }
            if(i==1){
             return 1;
            }
            if(i>1){
                factorial = factorial*i;
            }
        }
        return factorial;
    }
}