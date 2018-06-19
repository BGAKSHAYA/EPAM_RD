/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.epam_maven;
import java.util.Scanner;
/**
 *
 * @author Akshaya
 */
public class Quick_Sort {
    void quicksort(int a[], int low, int high)
    {
        if (low < high)
        {
            int partition = partition(a, low, high);
            quicksort(a, low, partition-1);
            quicksort(a, partition+1, high);
        }
    }
    int partition(int a[], int low, int high)
    {
        int pivot = a[high]; 
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (a[j] <= pivot)
            {
                i++;
                a[i]=a[i]+a[j];
                a[j]=a[i]-a[j];
                a[i]=a[i]-a[j];
            }
        }
        
        a[i+1]=a[i+1]+a[high];
        a[high]=a[i+1]-a[high];
        a[i+1]=a[i+1]-a[high];

        return i+1;
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int length=in.nextInt(),i;
        int a[]=new int[length];
        for(i=0;i<length;i++)
            a[i]=in.nextInt();
  
        Quick_Sort q = new Quick_Sort();
        q.quicksort(a, 0, length-1);
        System.out.println("Sorted elements are: ");
        for(i=0;i<length;i++)
            System.out.println(a[i]+" ");
        
    }
}