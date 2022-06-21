import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    int tab[] = {1, 2, 3, 4, 5, 6, 7, 8};
     System.out.println("Posortowana malejaco:");
    for (int i=0; i<tab.length; i++)
      {
        System.out.print(tab[(tab.length)-(i+1)]);
        System.out.print(" ");
      }
}
}