package XML_parser;

import entity.Patient;
import entity_list.Patient_list;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.util.Date;
import java.util.List;


public class Parser {

    public static Date parseDate(String date)
    {
        long lng = Date.parse(date);
        Date date2=new Date(lng+"L");
        return date2;
    }

    public static List<Patient> XMLReader(String param) {
        try {
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();

            InputStream resourceAsStream = classLoader.getResourceAsStream(param);

            JAXBContext context = JAXBContext.newInstance(Patient_list.class);

            Unmarshaller unmarshaller = context.createUnmarshaller();

            Patient_list patients = (Patient_list) unmarshaller.unmarshal(resourceAsStream);
            return patients.getPatients();
        } catch (JAXBException ex) {
            throw new RuntimeException();
        }
    }
}
