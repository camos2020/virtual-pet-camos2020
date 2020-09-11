package Virtualpet;

import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {

        String ownerResponse;
        Scanner input = new Scanner(System.in);

        VirtualPet myPet = new VirtualPet("Fido", 2, 5, 8, 6, 4);

        System.out.println("Menu Options, Please choose your next action:");
        System.out.println("1. I would like to FEED " + myPet.getPetName());
        System.out.println("2. I would like to provide WATER for " + myPet.getPetName());
        System.out.println("3. I would like to take " + myPet.getPetName() + " to the VET");
        System.out.println("4. I would like to PLAY WITH " + myPet.getPetName());
        System.out.println("5. I would like to put " + myPet.getPetName() + " to sleep");
        System.out.println("6. I would like to EXIT");
        ownerResponse = input.nextLine();



        while (!ownerResponse.equals("6")) {


            System.out.println("Hunger level is now " + myPet.getHungerLevel());
            System.out.println("Thirst level is now " + myPet.getThirstLevel());
            


            if (ownerResponse.equals("1")) {
                myPet.feedPet();
                System.out.println("You have fed  " + myPet.getPetName());
                System.out.println("Hunger level is now " + myPet.getHungerLevel());

            } else if (ownerResponse.equals("2")) {
                myPet.giveWater();
                System.out.println("You have provided " + myPet.getPetName() + " with water");
                System.out.println("Thirst level is now " + myPet.getThirstLevel());

            } else if (ownerResponse.equals("3")) {
                myPet.vetTrip();
                System.out.println("You have taken " + myPet.getPetName() + " to the vet clinic");
                System.out.println("Wellness level is now " + myPet.getWellnessLevel());

            } else if (ownerResponse.equals("4")) {
                myPet.playWithPet();
                System.out.println("You have played with " + myPet.getPetName());
                System.out.println("Boredom level is now " + myPet.getBoredomLevel());

            } else if (ownerResponse.equals("5")) {
                myPet.petRest();
                System.out.println("You have put " + myPet.getPetName() + " to sleep");
                System.out.println("Boredom level is now " + myPet.getSleepLevel());

            } else {
                System.out.println("I'm sorry, that is an invalid response");
            }

            System.out.println("Menu Options, Please choose your next action:");
            System.out.println("1. I would like to FEED " + myPet.getPetName());
            System.out.println("2. I would like to provide WATER for " + myPet.getPetName());
            System.out.println("3. I would like to take " + myPet.getPetName() + " to the VET");
            System.out.println("4. I would like to PLAY WITH " + myPet.getPetName());
            System.out.println("5. I would like to put " + myPet.getPetName() + " to sleep");
            System.out.println("6. I would like to EXIT");
            ownerResponse = input.nextLine();

            myPet.tick();
        }

        System.out.println("Thank you for playing!!!");
        input.close();

    }
}


