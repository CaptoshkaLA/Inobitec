package entity;

import XML_auxiliary_functionality.Auxiliary_class;
import XML_parser.Parser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "patient")

/**
 * A class that implements the patient entity
 */
public class Patient {

    @XmlElement(name = "first_name")
    public String firstName;
    @XmlElement(name = "middle_name")
    public String middleName;
    @XmlElement(name = "last_name")
    public String lastName;
    @XmlElement(name = "birthday")
    public Date birthday;
    @XmlElement(name = "gender")
    public String gender;
    @XmlElement(name = "phone")
    public String phone;

    public Patient() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void print() {
        System.out.println(Auxiliary_class.getName(getFirstName(), getLastName(), getMiddleName()));
        System.out.println(Auxiliary_class.ageCalculator(Parser.parseDate(getBirthday().toString())));
        System.out.println(getGender());
        System.out.println(getPhone());
    }

    @Override
    public String toString() {
        return "Фамилия: " + lastName + "\nИмя" + firstName + "\nОтчество" + middleName +
                "\nДата рождения " + birthday +
                "\nПол: " + gender +
                "\nНомер телефона: " + phone + '\n';
    }
}
