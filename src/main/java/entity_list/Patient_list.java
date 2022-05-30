package entity_list;
import entity.Patient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;


@XmlRootElement(name = "patients")
@XmlAccessorType(XmlAccessType.FIELD)
public class Patient_list {

    @XmlElement(name = "patient")
    private List<Patient> patients = null;

    public List<Patient> getPatients() {
        return patients;
    }
}
