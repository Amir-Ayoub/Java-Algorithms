/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package knapsack.problem;

/**
 *
 * @author KIT
 */
public class KnapsackProblem {

    public int max(int a1,int a2)
    {
        return(a1 > a2)?a1 : a2;
    }
    public int maxknapSackValue(int C,int wt[],int v[],int l)
    {
        if(l==0 || C ==0)
        {
            return 0;
        }
        if(wt[l-1] > C)
        {
            return maxknapSackValue(C,wt,v,l-1);
        }
        else
        {
            int val1= maxknapSackValue(C - wt[l-1],wt,v,l-1);
            int val2= maxknapSackValue(C,wt,v,l-1);
            return max(v[l-1] + val1,val2);
        }
    }
    public static void main(String[] args) {
        int values[] = new int[]{100,60,120};
        int weight[] = new int[]{20,10,30};
        int C =  50;
        int length = values.length;
        KnapsackProblem knapObj = new KnapsackProblem();
        int maxValue = knapObj.maxknapSackValue(C,weight,values,length);
        System.out.println("The maximum value is " + maxValue);
    }
    
}
