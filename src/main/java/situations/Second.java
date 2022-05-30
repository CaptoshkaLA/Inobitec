package situations;
import XML_auxiliary_functionality.Auxiliary_class;
import XML_parser.Parser;
import entity.Patient;
import java.util.List;

/**
 *   В качестве аргумента указано только название файла.
 */
public class Second implements Situation {

    @Override
    public void situation(String[] params) {

        if (params.length == 1 && params[0] != null) {
            List<Patient> patients = Parser.LoadFileAndReadFromXML(params[0]);
            System.out.println("ФИО\tВозраст\tПол\tТелефон");
            patients.forEach(patient -> {
                        String FIO = Auxiliary_class.getName(patient.getFirstName(), patient.getLastName(), patient.getMiddleName());
                        int age = Auxiliary_class.ageCalculator(Parser.parseDate(patient.getBirthday().toString()));
                        String gender = patient.getGender();
                        String phone = patient.getPhone(); }
            );
            System.exit(0);
        }
    }
}