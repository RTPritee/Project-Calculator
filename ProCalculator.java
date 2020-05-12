import java.util.Scanner;
//import javax.swing.*; 
public class ProCalculator {
public static void main(String[]args)
{
	  try (Scanner sc = new Scanner(System.in)) {
		double a= 0.0;
		  double b= 0.0;
		  double c= 0.0;
		  System.out.println("Enter the first number ");
		  a= sc.nextDouble();
		  System.out.println("Enter the second number");
		  b= sc.nextDouble();
		  System.out.println("Choose the operator");
		  System.out.println("\n1.Addition"+"\n2.Subtraction"+"\n3.Multiplication"+"\n4.Division");
		  System.out.println("Please enter the operator number");
		  double nub = sc.nextDouble();
		  double addition = 1;
		  double subtraction =2;
		  double multiplication = 3;
		  double division = 4;
		  if (nub == addition)
		  {
			  c=a+b;
			  System.out.println(+c);
		  }
		  else if (nub==subtraction)
		  {
			  c=a-b;
			  System.out.println(+c);
		  }
		  else if (nub==multiplication)
		  {
			  c=a*b;
			  System.out.println(+c);
		  }
		  else if (nub==division)
		  {
			  try{
				  c=a/b;
				  System.out.println(+c);				  
			   }
			  catch(ArithmeticException e)
			     {
				  System.out.println(e);
			     
			      System.out.println("second input 0 taken and division by zero is Infinity");
			     }
			     
		   }
			 
			  }
		  }
	
}

