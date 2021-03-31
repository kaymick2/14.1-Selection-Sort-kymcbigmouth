import java.util.*;

class Main {
  public static void main(String[] args) {
    Random rNGesus = new Random();
    int a[] = new int[10];
    for (int x = 0; x <= (a.length) - 1; x++) {
      a[x] = rNGesus.nextInt(70);
    }
    System.out.println("The unsorted array is: " + Arrays.toString(a));
    for (int j = 0; j < a.length - 1; j++) {
      int iMin = j;
      for (int i = j + 1; i < a.length; i++) {
        if (a[i] < a[iMin]) {
          iMin = i;
        }
      }
      if (iMin !=j){
        int tempVar=a[iMin];
        if 
      }
    }

  }
}