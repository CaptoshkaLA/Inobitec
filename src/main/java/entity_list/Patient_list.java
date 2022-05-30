package entity_list;
import XML_auxiliary_functionality.Auxiliary_class;
import XML_parser.Parser;
import entity.Patient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;


@XmlRootElement(name = "patients")
@XmlAccessorType(XmlAccessType.FIELD)

/**
 * A class that implements the patient list
 */
public class Patient_list {

    @XmlElement(name = "patient")
//    private List<Patient> patients = null;

    private List<Patient> patients;

    public Patient_list() {patients=null;}

    public List<Patient> getPatients() {
        return patients;
    }

}
