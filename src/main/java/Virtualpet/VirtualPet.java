package Virtualpet;

public class VirtualPet {

    private int wellnessLevel;  //Take pet to Vet.
    private int hungerLevel; // Feed Pet.
    private int thirstLevel; //Give pet water.
    private int sleepLevel; //Pet needs rest.
    private int boredomLevel; // Play with pet.
    private String petName;
    //private int ownerResponse = 0;

    public void tick() {
        hungerLevel += 1;
        wellnessLevel -= 1;
        thirstLevel += 1;
        sleepLevel += 1;
        boredomLevel += 1;

    }

    public String getPetName() {
        return petName;
    }

    int getHungerLevel() {
        return hungerLevel;
    }

    int getThirstLevel() {
        return thirstLevel;
    }

    int getWellnessLevel() {
        return wellnessLevel;
    }

    int getSleepLevel() {
        return sleepLevel;
    }

    int getBoredomLevel() {
        return boredomLevel;
    }


    // Constructor
    public VirtualPet(String petName, int wellnessLevel, int hungerLevel, int thirstLevel, int sleepLevel, int boredomLevel) {
        this.petName = petName;
        this.wellnessLevel = wellnessLevel;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.sleepLevel = sleepLevel;
        this.boredomLevel = boredomLevel;
    }

    public void feedPet() {
        hungerLevel -= 2;
    }

    public void giveWater() {
        thirstLevel -= 2;
    }

    public void vetTrip() {
        wellnessLevel += 2;
    }

    public void playWithPet() {
        boredomLevel -= 2;
    }

    public void petRest() {
        sleepLevel -= 2;
    }

}



