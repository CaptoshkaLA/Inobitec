package correctly_situations;
import XML_auxiliary_functionality.Auxiliary_class;
import XML_parser.Parser;
import entity.Patient;
import java.util.Comparator;
import java.util.List;

/**
 *  Sorting by age is indicated
 */
public class Fourth implements Situation {
    @Override
    public void situation(String[] params) {
        List<Patient> patients = Parser.XMLReader(params[0]);

        if ("age".equals(params[1]) && params.length == 2) {
            System.out.println("ФИО\tВозраст\tПол\tТелефон");
            patients.stream().sorted(Comparator.comparing(Patient::getBirthday).reversed()).forEach(patient -> { patient.print();});
            System.exit(0);
        }
    }
}