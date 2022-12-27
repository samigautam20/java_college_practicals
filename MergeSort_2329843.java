import java.util.*;
public class MergeSort_2329843{
          ArrayList < Integer > getInput(ArrayList < Integer > al) {
            //method for taking input
        Scanner input = new Scanner(System.in);
        System.out.println("Your desired amount of arrays: ");
        int num= input.nextInt();
        System.out.println("Enter " +num+ " array elements: ");
        for (int i = 0; i < num; i++) {
          al.add(input.nextInt());
        }
        input.close();
        return al;
      }

      void getOutput(ArrayList < Integer > al) {
          //method for getting output
          System.out.println("The unsorted elements are: " + al);
          sort(al, 0, al.size() - 1);
        System.out.println("The sorted elements: " + al);
      }

      void merge(ArrayList < Integer > al, int first, int mid, int last) {
        ArrayList < Integer > Sort_1 = new ArrayList < Integer > (); 
        int j = mid + 1;
        int i = first;

        while (i <= mid && j <= last) {
          if (al.get(i) < al.get(j)) {
            i++;
          } else {
            Sort_1.add(al.get(j));
            j++;
          }
        }
        for (int k = i; k <= mid; k++) Sort_1.add(al.get(k));
        for (int k = 0; k < Sort_1.size(); k++) {
          al.set(first  + k, Sort_1.get(k));
        }
      }

      void sort(ArrayList < Integer > al, int first, int last) {
        if (first >= last) return;

        int mid = (first + last) / 2;
        sort(al, first , mid);
        sort(al, mid + 1, last);
        merge(al, first, mid, last);
      }

      public static void main(String[] args) {
          //calling the methods
        MergeSort_2329843 x = new MergeSort_2329843();
        ArrayList < Integer > al = new ArrayList < Integer > ();
        x.getInput(al);
        x.getOutput(al);
        System.out.println("Sami Gautam");
      }
}

