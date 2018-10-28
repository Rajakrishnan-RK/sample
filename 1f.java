import java.util.Scanner;
class check
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int num=s.nextInt();
  if(num<0)
    System.out.println("The number is Negative");
  else if(num>0)
    System.out.println("The number is Positive");
  else
    System.out.println("The number is Zero");
  }
}
