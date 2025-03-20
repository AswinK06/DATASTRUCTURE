import java.util.*;
class main
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[10];
      for(int i = 0;i<arr.length;i++)
        {
          arr[i] = sc.nextInt();
        }
      for(int i = n;i>=1;i--)
        {
          arr[i] = arr[i-1];
        }
      for(int i = 0;i<arr.length;i++)
        {
          System.out.println("Element at " + i + ":" , arr[i]);
        }
    }
  }
