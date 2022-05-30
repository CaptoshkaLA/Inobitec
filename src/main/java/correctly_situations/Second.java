package correctly_situations;
import XML_auxiliary_functionality.Auxiliary_class;
import XML_parser.Parser;
import entity.Patient;
import entity_list.Patient_list;
import java.util.List;

/**
 *  Only the file name is specified as an argument.
 */
public class Second implements Situation {

    @Override
    public void situation(String[] params) {

        if (params.length == 1 && params[0] != null) {
            List<Patient> patients = Parser.XMLReader(params[0]);
            System.out.println("ФИО\tВозраст\tПол\tТелефон");
            patients.forEach(patient -> {
                patient.print();
            });
            System.exit(0);
        }
    }
}

