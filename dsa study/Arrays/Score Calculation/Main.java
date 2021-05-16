
import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    int N = sc.nextInt ();
    int k = sc.nextInt ();

    int[] arr = new int[k];

    long scoreMul = 1;
    long scoreAdd = 0;

    for (int i = 0; i < arr.length; i++)
      {
	arr[i] = sc.nextInt ();
      }

    int[] last_digit_arr = new int[k];

    for (int i = 0; i < arr.length; i++)
      {
	last_digit_arr[i] = arr[i] % 10;
      }

    for (int i = 0; i < last_digit_arr.length; i++)
      {
	scoreMul = scoreMul * last_digit_arr[i];
	scoreAdd = scoreAdd + last_digit_arr[i];
      }

    if (scoreAdd >= scoreMul)
      {
	System.out.println (scoreAdd);
      }
    else
      {
	System.out.println (scoreMul);
      }

  }
}
