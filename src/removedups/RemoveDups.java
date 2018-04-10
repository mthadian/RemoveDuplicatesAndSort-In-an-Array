/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package removedups;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author thadian
 */
public class RemoveDups {

    /**
     * @param args the command line arguments
     */
    public static void printRawArray(int arr[])
        {
            for(int r=0;r<arr.length;r++)
            {
                //
                System.out.print(""+ arr[r] +" ");
                
            }
        }
    
    public static void sortRemoveDuplicates(int[] arr)
    {
        
         int[] arr1=Arrays.stream(arr)
                    .distinct()
                    .toArray();
            Arrays.sort(arr1);
             String arrs = Arrays.toString(arr1);
             String result = new StringBuffer(arrs).reverse().toString();
             System.out.println(result);
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter the number of numbers to enter in the array");
        int num=Input.nextInt();
        int[] array1= new int[num];
        System.out.println("Enter the" + num + "numbers into the array" );
        for(int i=0;i<array1.length;i++)
        {
            array1[i]=Input.nextInt();
            
        }
       System.out.print("The Unsorted array is "); 
        printRawArray(array1);  
        System.out.println("");
       System.out.println("The sorted array without duplicates ");
       sortRemoveDuplicates(array1);
        
        
        
    }
    
    
}
