import exception.First;
import situations.*;

public class Main {

        public static void main(String[] args) {

                Situation firstSituation = new First();
                firstSituation.situation(args);

                Situation secondSituation = new Second();
                secondSituation.situation(args);

                Situation thirdSituation = new Third();
                thirdSituation.situation(args);

                Situation forthSituation  = new Fourth();
                forthSituation.situation(args);

    }

}