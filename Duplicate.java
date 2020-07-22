import java.util.*;

class Duplicate {
    void Repeating(int a[], int s) {
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < s; i++) {
            if (a[Math.abs(a[i])] >= 0)
                a[Math.abs(a[i])] = -a[Math.abs(a[i])];
            else
                System.out.print(Math.abs(a[i]) + " ");
        }
    }

    public static void main(String[] args) {
        Duplicate duplicate = new Duplicate();
        int a[] = { 1, 2, 3, 1, 3, 6, 6 };
        int a_s = a.length;
        duplicate.Repeating(a, a_s);
    }
}