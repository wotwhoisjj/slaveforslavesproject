package com.mycompany.sohaieh; // *idk wtf is this for la don't ask me

public class ChangeC {
    private String name;
    private int coinAmt;
    private int denomination1, denomination2, denomination3, denomination4, denomination5, denomination6, denomination7, denomination8;

    
  // Constructor with 2 parameters
public ChangeC(String name, int coinAmt) {
   this.name = name;
   this.coinAmt = coinAmt;
}


// Getter Methods
public String getName() {
    return name;
    }

public int getcoinAmt(){
    return coinAmt;
}


// Setter Methods
public void setName(String newName){
    this.name = newName;
}

public void setCoinAmt(String newCoinAmt){
    this.name = newCoinAmt;
}

/*
This is assuming that the we only need to provide user input 10 times exactly, if it needs to be dynamic then gg.com HEH
*/
public String[] nameList = new String[9];
public int[] coinList = new int[9];

/*
public String[] getNameList() {
    return nameList;
}

public int[] getCoinList() {
    return coinList;
}
*/

}





