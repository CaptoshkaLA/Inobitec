import exception_situation.First;
import correctly_situations.*;

public class Main {

        public static void main(String[] args) {

                System.out.println("There will be an exception");
                Situation firstSituation = new First();
                firstSituation.situation(args);

                System.out.println("Here is a list of all patients without sorting");
                Situation secondSituation = new Second();
                secondSituation.situation(args);

                System.out.println("Here you will see a list sorted by name");
                Situation thirdSituation = new Third();
                thirdSituation.situation(args);

                System.out.println("Here you will see a list sorted by date of birth");
                Situation forthSituation  = new Fourth();
                forthSituation.situation(args);

    }

}