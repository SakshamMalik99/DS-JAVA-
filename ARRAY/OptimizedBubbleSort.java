import java.util.Arrays;

public class OptimizedBubbleSort {
    static void sort(int[] arrA) {
        if (arrA == null || arrA.length == 0)
            return;
        System.out.println("Original Array: " + Arrays.toString(arrA));
        boolean isSwapped;
        int size = arrA.length;
        for (int i = 0; i < size - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arrA[j] > arrA[j + 1]) {
                    int temp = arrA[j];
                    arrA[j] = arrA[j + 1];
                    arrA[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped == false)
                break;
        }
        System.out.println("Sorted Array: " + Arrays.toString(arrA));
    }

    public static void main(String[] args) {
        int[] arrA = { 5, 1, 9, 3, 2, 10 };
        sort(arrA);
    }
}

/*
 * public class Bubble {
 * 
 * public int[] bubble(int b[]){ int temp,temp1; for(int i=0;i<b.length-1;i++){
 * if(b[i]>b[i+1] ){ temp=b[i]; b[i]=b[i+1]; b[i+1]=temp; while(i>0){
 * if(b[i]<b[i-1]){ temp1=b[i]; b[i]=b[i-1]; b[i-1]=temp1; i--; } else
 * if(b[i]>b[i-1]){i--;} } } else{continue;} } return b; } public void see(int
 * []a){ for(int j=0;j<a.length;j++){ System.out.print(a[j]+","); } } public
 * static void main(String []args){ int b[]={5,1,4,2,0,3}; int v[]=new int[100];
 * Bubble br=new Bubble(); v=br.bubble(b); br.see(v); } }
 */