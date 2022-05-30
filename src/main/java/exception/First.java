package exception;

import situations.Situation;

/**
 *   Не задан ни один из аргументов
 */
public class First implements Situation {

    @Override
    public void situation(String[] params) {
        if (params.length == 0) { throw new RuntimeException("Не задан ни один из аргументов"); }
    }

}