package by.itstep.antonsvirid.model.logic;

// Определение колич голов дракона по возрасту
// возраст
// 3 головы при рождении
// 1) 1..100 --> 3
// 2) 101..200 --> 2
// 3) 201... --> 1
// 4) защита от дурака

import by.itstep.antonsvirid.model.data.Dragon;

public class DragonLogic {
    public static final int FIRST_PERIOD = 100;
    public static final int SECOND_PERIOD = 200;

    public static int calculateHeads(Dragon dragon) {
        // пасивная защита от дурака
        if (dragon.age < 1) {
            return -1;
        }

        int head = 3;
        // логика
        if (dragon.age <= FIRST_PERIOD) {
            head += dragon.age * 3;
        } else if (dragon.age <= SECOND_PERIOD) {
            head += FIRST_PERIOD * 3 + (dragon.age - FIRST_PERIOD) * 2;
        } else {
            head += (FIRST_PERIOD * 3 + (SECOND_PERIOD - FIRST_PERIOD) * 2)
                    + (dragon.age - SECOND_PERIOD);
        }

        return head;
    }
}