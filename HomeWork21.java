
package homework2.pkg1;

/* 
 * Chapter No. 2    Excercise No. 2
 * File Name: HomeWork2.java
 * @author: Eric Schenck
 * Date: September 2, 2012
 * 
 * 
 * Problem Statement: Write a program that calculates and outputs the total 
 * number of calories burned for a 150-lb person who runs 6 MPH for 30 mins,
 * plays basketball for 30 mins, and then sleeps for 6 hours.Test for a 
 * 150-lb person and a 250-lb person, print screen both results. the weight of 
 * the people is input.
 * 
 * Formuals: Calories/Minute = 0.0175 * MET * Weight in Kilograms
 * One Kilogram is equal to 2.2 pounds.
 *
 * Overall plan:
 * 1.)ask the user to input the weight in pounds
 * 2.) Change pounds of weight into kilograms
 * 3.) perform three seperate equations to figure out the amount of 
 * calories burned per minute for each activity.
 * 4.) Perform three seperate equations to multiply the amount of calories
 * burned per minute per activity by the amount of time stated in the problem
 * for each individual activity
 * 5.) add the three calorie amounts to calculate the total amount of 
 * calories burned.
 * 6.) print out a statement with the amount of calories burned.
 *
 * 
 */

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class HomeWork21 {

    //setting the constants to their METS value.
    public static final int RUNNING = 10;
    public static final int BASKETBALL = 8;
    public static final int SLEEPING = 1;
    public static final double KILO = 2.2;
    public static final double NEW = 0.0175;
    public static final double YES = 0;
    public static final double NO = 1;
    
    
    public static void main(String[] args) {

    
    String userInput = JOptionPane.showInputDialog(null, "Please type in how much "     
            + "the person weighs:/nExample(150 or 250)");

    int weight = Integer.parseInt(userInput);
        
       
        
        // declaring doubles to define later
        double kilo, sum1, sum2, sum3, fnl, ans1, ans2, ans3;
        
        // changing pounds into kilograms
        double weightInKilo = weight / KILO;
        
        //calculate the amount of calories burned per minute while running 
        double firstSum = NEW * RUNNING * weightInKilo;
        
        
        
        //calculate the amount of calories burned per minute while playing
        //basketball.
        sum2 = NEW * BASKETBALL * weightInKilo;
       
        
        
        //calculate the amount of calories burned per minute while sleeping
        sum3 = NEW * SLEEPING * weightInKilo; 
        
        
        
        //calcualte the amount of calories burned during 30 minutes of running
        ans1 = sum1 * 30;
        
        
        
        //calculate the amount of calories burned during 30 minutes of playing
        //basketball
        ans2 = sum2 * 30;
       
        
        //calculate the amount of calories burned during 6 hours of sleeping
        ans3 = sum3 * 3600;
        
        
        //adding those three calories sum's together, to produce the total 
        //amount of calories burned
        fnl = ans1 + ans2 + ans3;
       
        
        DecimalFormat df1 = new DecimalFormat("0.##");
       
        
        
        
        // print out a message along with the total amount of calories burned
        System.out.println("The total amount of calories burned");
        System.out.print("for a " + weight + "lb person is... " );
        System.out.println(df1.format(fnl) + " calories");
        System.out.println("Goodbye");
        
    }
}
