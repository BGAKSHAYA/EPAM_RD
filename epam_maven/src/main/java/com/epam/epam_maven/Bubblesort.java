
package com.epam.epam_maven;
import java.util.Scanner;
/**
 *
 * @author Akshaya
 */
public class Bubblesort {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int length=in.nextInt(),i,j;
        int array[]=new int[length];
        for(i=0;i<length;i++)
            array[i]=in.nextInt();
        for(i=0;i<length-1;i++)
        {
            for(j=0;j<length-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    array[j]=array[j+1]+array[j];
                    array[j+1]=array[j]-array[j+1];
                    array[j]=array[j]-array[j+1];
                }
            }
        }
        System.out.println("Sorted elements are: ");
        for(i=0;i<length;i++)
            System.out.println(array[i]+" ");
                    
    }
}
