/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selection.sort;

/**
 *
 * @author KIT
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void selectionSort(int[] arr) {
    for(int i=0; i<arr.length - 1; i++)
        {
            int index=i;
         for(int j=i+1;j<arr.length;j++){
             if(arr[j] < arr[index]){
                 index = j;
                 
             }
         }
          int smallerNumber = arr[index];
          arr[index]=arr[i];
          arr[i] = smallerNumber;
          
        }
    }
    public static void main(String a[])
    {
        int[] arr1={9,14,34,55,66,43,2};
        System.out.println("Before Selection Sort");
        for(int i:arr1)
        {
            System.out.println(i+" ");
            
        }
        System.out.println();
        selectionSort(arr1);
       
 System.out.println("After Selection Sort");
for(int i:arr1)
{
System.out.print(i+" ");
}
}
}
