package virtualpet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class NumberRangeTest<NumberRange> {

    @Test
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
            }
        }
    }
}









/*
public class NumberRangeTest {

    @Test
    public void shouldTestARandomNumberRange() {
        NumberRange underTest = new NumberRange();
        underTest.createRandomNumber(1, 10);
        int createdRandomNumber = underTest.getRandomNumber();
        assertTrue(1 <= createdRandomNumber && createdRandomNumber <= 10);


        class NumberRange {
            public void createRandomNumber(int i, int i1) {
            }

            public int getRandomNumber() {
                return 0;

            }
        }
    }

    private class NumberRange {
        public int getRandomNumber() {
            return 0;
        }

        public void createRandomNumber(int i, int i1) {
        }
    }
}



/*
    public void ifNumber1SelectedFEEDShouldprint() {
        //Arrange

        //Act
        boolean underTest = ownerResponse.equals("1");

        //Assert
        assertThat(System.out.println(); String myPet;
        is("You have provided " + myPet + " with water");
    }

    private void assertThat(int actualBalance, ElementMatcher.Junction<Object> objectJunction) {
    }

    private class NumberRange {
        public void createRandomNumber(int i, int i1) {
        }

        public int getRandomNumber() {
            return 0;
        }
    }
}


}
