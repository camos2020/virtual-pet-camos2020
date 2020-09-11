package virtualpet;
import Virtualpet.VirtualPet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetTest {
    @Test
    public void RandomRangeTest(){
        int hungerLevel;
        int boredomLevel;
        int wellnessLevel;
        int thirstLevel;
      int sleepLevel;

        NumberRange underTest = new NumberRange();
        underTest.createRandomNumber(1, 5);
        int createdRandomNumber = underTest.getRandomNumber();
        assertTrue(1<=createdRandomNumber && createdRandomNumber <=5);

        public class NumberRange {
            private int randomNumber;
            public int getRandomNumber(){
                return randomNumber;
            }
            public void createRandomNumber(int low, int high) {
                randomNumber = (int)Math.random()* (high-low) +1;
            }
        }
        //Act
        int randomHunger = 3;
        boolean randomHunger = true
        System.out.println(randomHunger);
            }
    private class NumberRange {
        public void createRandomNumber(int i, int i1) {
        }
        public int getRandomNumber() {
            return 0;
        }
    }


    //private int getRandomNumber() {
     //   return 0;


   // private void hungerLevel(int i, int i1) {
    }

    //private class hungerLevel {








            /*
            public void shouldTestARandomNumberRange() {
        NumberRange underTest = new NumberRange();
        underTest.createdRandomNumber(1, 5);
        int createdRandomNumber = underTest.getRandomNumber();
        assertTrue(1 <= createdRandomNumber && createdRandomNumber <= 5);

        public class NumberRange {
            private int randomNumber;

            public int getRandomNumber() {
                return randomNumber;
            }

            public void createRandomNumber(int low, int high) {
                randomNumber = (int) Math.random() * (high - low) + 1;
             */

    //Act

    //ASSERT



