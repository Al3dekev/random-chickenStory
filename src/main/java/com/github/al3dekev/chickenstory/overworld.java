package com.github.al3dekev.chickenstory;

import java.util.Scanner;


public class overworld {

    private Scanner lire = new Scanner(System.in);
    private int userAnswer;

    public overworld(){

    }

    public void initialisation(){
        System.out.println("Welcome to the Chicken story.");
    }

    /**
     * Menu of selection of the information to make spawn a chicken
     */
    public void chickenSelectionMenu(){

        System.out.println("Please, select a chicken");
        System.out.println("1: Chicken");
        System.out.println("2: niggaChicken");
        do {
            this.setUserAnswer(lire.nextInt());
        }while(getUserAnswer() < 1 || getUserAnswer() > 2);
    }

    /**
     *  Evaluating the User answer to make something happening
     *
     */
    public void chickenAnswerResult(){

        if(getUserAnswer() == 1) {
            poule chicken = new poule("ChickenBoard","Welcome aboard Captain");
            System.out.println(chicken.getName()+": "+chicken.getWhispering());
        } else{
            poule chicken = new niggaPoule("NiggaChicken","What's up Nigga");
            System.out.println(chicken.getName()+": "+chicken.getWhispering());
        }
    }

    /**
     * Closing the app
     */
    public void closeApp(){
        System.out.println("Story ends");
        System.exit(0);
    }


    /**
     *
     * @param userAnswer
     */
    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    /**
     *
     * @return
     */
    public int getUserAnswer() {
        return userAnswer;
    }
}
