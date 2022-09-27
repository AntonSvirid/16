package by.itstep.antonsvirid.model.logic;

import by.itstep.antonsvirid.model.data.Dragon;
import static org.junit.Assert.*;   //подключение библиотеки Assert для простого вызова
import org.junit.Test;

public class DragonLogicTest {

    @Test
    public void testFirstPeriodPositive() {
        // подготовительная чать
        Dragon dragon = new Dragon();
        dragon.age = 10;
        int expected = 33;

        // действие

        int actual = DragonLogic.calculateHeads(dragon);

        assertEquals(expected, actual);
    }

    @Test
    public void testFirstPeriodNegative() {

        Dragon dragon = new Dragon();
        dragon.age = -10;
        int expected = -1;

        int actual = DragonLogic.calculateHeads(dragon);

        assertEquals(expected, actual);
    }
    @Test
    public void testFirstBoundPositive() {

        Dragon dragon = new Dragon();
        dragon.age = DragonLogic.FIRST_PERIOD;
        int expected = 303;

        int actual = DragonLogic.calculateHeads(dragon);

        assertEquals(expected, actual);
    }

}
