import java.util.Scanner;
class Reverse 
{
public static void main(String[] args)
{
 Scanner s = new Scanner(System.in);
 int n = s.nextInt();
 int rev = 0, ren ;
 while (n!= 0)
{
 ren = n%10;
 rev = rev*10+ren;
 n = n/10;
}
 System.out.println("reverse = "+rev);
}
}
