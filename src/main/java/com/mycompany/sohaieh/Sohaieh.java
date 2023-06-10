package com.mycompany.sohaieh;
import java.util.Arrays;
import java.util.Scanner;

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
        
        System.out.println("Please enter the name of the person: ");
        String userName = inputName.nextLine();  // Read user input
        System.out.println("Please enter the coin value for the person: ");
        int userCoin = inputCoin.nextInt();  // Read user input
        
        ChangeC arrayObject = new ChangeC(userName, userCoin);
        arrayObject.nameList[0] = userName;
        arrayObject.coinList[0] = userCoin;
        
        System.out.println(arrayObject.nameList[0]);
        System.out.println("Do you have more person to enter (Y/N)");
        // String yesNo = yesOrNo.nextLine();
        // while (yesNo != "Y"){
            
        }
    }

