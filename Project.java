import java.util.Scanner;

public class Project 
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in); 
    System.out.println("Enter a number");
    int num= sc.nextInt();
    if(num%2==0) 
    {
        System.out.println("The number is" + num + "and is an even number");

    }
    else if(num%2!=0)
    {
        System.out.println("The number is" + num +  "and is an odd number");
    }
}
}


    
