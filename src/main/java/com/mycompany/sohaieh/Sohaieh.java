package com.mycompany.sohaieh; //idk wtf is this for la don't ask me
import java.util.Arrays; //self explanatory
import java.util.Scanner; //self explanatory

/**
 *
 * @author JIAJIAN-ADM
 */
public class Sohaieh {

    public static void main(String[] args) {
        // ChangeC obj = new ChangeC("test", 123);
        Scanner yesOrNo = new Scanner(System.in);
        Scanner inputName = new Scanner(System.in);
        Scanner inputCoin = new Scanner(System.in);
        
        /* I forgot the reason as to why I'm putting this before the loop already,
        but I will create a loop with the exact questions 
        */
        System.out.println("Please enter the name of the person: ");
        String userName = inputName.nextLine();
        System.out.println("Please enter the coin value for the person: ");
        int userCoin = inputCoin.nextInt();
        
        // *Storing the first set of user input into the array created in ChangeC.java 
        ChangeC arrayObject = new ChangeC(userName, userCoin);
        arrayObject.nameList[0] = userName;
        arrayObject.coinList[0] = userCoin;
        
        // System.out.println(arrayObject.nameList[0]);
        System.out.println("Do you have more person to enter (Y/N)");
        // String yesNo = yesOrNo.nextLine();
        // while (yesNo != "Y"){
            
        }
    }

