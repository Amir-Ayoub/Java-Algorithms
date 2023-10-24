/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomelementpicker;

import java.util.Random;
public class RandomElementPicker {

    
    public static void main(String[] args) {
        String[] myArray = {"apple","banana","cherry","grapes"};
        Random random = new Random();
        String randomElement = myArray[random.nextInt(myArray.length)];
    
    System.out.println(randomElement);
    
}
}