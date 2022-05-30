package exception_situation;

import correctly_situations.Situation;

/**
 *  A class that implements the first scenario when a user error is issued
 */
public class First implements Situation {

    @Override
    public void situation(String[] params) {
        if (params.length == 0) { throw new RuntimeException("Не задан ни один из аргументов"); }
    }

}