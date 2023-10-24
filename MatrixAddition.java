/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixaddition;

/**
 *
 * @author KIT
 */
public class MatrixAddition {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int a[][]={{1,3,4},{2,4,1},{3,4,3}};
     int b[][]={{1,3,4},{3,4,2},{4,6,4}};
     int c[][]=new int[3][3];
     for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
             c[i][j]=a[i][j]+b[i][j];
             System.out.print(c[i][j]+"");;
             
         }
         System.out.println();
     }
    }
    
}
