package situations;
import XML_auxiliary_functionality.Auxiliary_class;
import XML_parser.Parser;
import entity.Patient;
import java.util.Comparator;
import java.util.List;

/**
 *   Сортирвока по возрасту
 */
public class Fourth implements Situation {
    @Override
    public void situation(String[] params) {
        List<Patient> patients = Parser.LoadFileAndReadFromXML(params[0]);

        if ("age".equals(params[1]) && params.length == 2) {
            System.out.println("ФИО\tВозраст\tПол\tТелефон");
            patients.stream().sorted(Comparator.comparing(Patient::getBirthday).reversed())
                    .forEach(patient ->
                            {
                                String FIO = Auxiliary_class.getName(patient.getFirstName(), patient.getLastName(), patient.getMiddleName());
                                int age = Auxiliary_class.ageCalculator(Parser.parseDate(patient.getBirthday().toString()));
                                String gender = patient.getGender();
                                String phone = patient.getPhone();
                            }
                    );
            System.exit(0);

        }
    }
}