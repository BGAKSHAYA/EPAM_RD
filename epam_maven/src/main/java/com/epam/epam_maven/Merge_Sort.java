package com.epam.epam_maven;
import java.util.Scanner;
/**
 *
 * @author Akshaya
 */
public class Merge_Sort {
    
    void mergesort(int a[], int left, int right)
    {
        if (left < right)
        {
            int middle = (left+right)/2;
            mergesort(a, left, middle);
            mergesort(a , middle+1, right);
            merge(a, left, middle, right);
        }
    }
    void merge(int a[], int left, int middle, int right)
    {
        int x = left;
        int y = middle + 1;
        int i = left;
        int b[]=new int[a.length];
        while((x <= middle)&&(y <= right))
        {
            if(a[x] <= a[y])
               b[i] = a[x++];
            else
               b[i] = a[y++];
            i++;
         }
        while(x <= middle)    
           b[i++] = a[x++];

        while(y <= right)   
           b[i++] = a[y++];

        for(i = left; i <= right; i++)
           a[i] = b[i];
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int length=in.nextInt(),i;
        int a[]=new int[length];
        for(i=0;i<length;i++)
            a[i]=in.nextInt();
        Merge_Sort m = new Merge_Sort();
        m.mergesort(a, 0, a.length-1);
        System.out.println("Sorted elements are: ");
        for(i=0;i<length;i++)
            System.out.println(a[i]+" ");
    }
}

