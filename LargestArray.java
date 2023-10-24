/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largestarray;

/**
 *
 * @author KIT
 */
public class LargestArray {

    public static int getLargest(int[] a,int total){
        int temp ;
        for(int i=0;i < total;i++)
        {
            for(int j = i+1;j < total;j++)
            {
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] =a[j];
                    a[j]=temp;
                }
            }
        }
        return a[total-1];
    }
    public static void main(String[] args) {
        int a[]={1,3,5,3,6,4};
        int b[]={44,55,33,73,77,55,99};
        System.out.println("Largest"+getLargest(a,6));
        System.out.println("Largest" + getLargest(b,7));

    }
    
}

