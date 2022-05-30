package correctly_situations;

import XML_auxiliary_functionality.Auxiliary_class;
import XML_parser.Parser;

import java.util.Comparator;
import java.util.List;
import entity.Patient;

/**
 *  Sorting by name is specified
 */
public class Third implements Situation {
    @Override
    public void situation(String[] params) {

        List<Patient> patients = Parser.XMLReader(params[0]);

        if ("name".equals(params[1]) && params.length == 2) {
            System.out.println("ФИО\tВозраст\tПол\tТелефон");
            patients.stream().sorted(Comparator.comparing(Patient::getLastName)).forEach(patient -> {
                        patient.print();
                    }
            );
            System.exit(0);

        }
    }
}