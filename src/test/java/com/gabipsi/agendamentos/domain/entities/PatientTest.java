package com.gabipsi.agendamentos.domain.entities;

import com.gabipsi.agendamentos.domain.entities.patient.Patient;
import com.gabipsi.agendamentos.domain.entities.patient.PatientFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestBody;

public class PatientTest {
    Patient patient = new Patient("Kaique Rierickson Torres", "706.706.706-06", "(81) 99999-9999", "riericksontorres@gmail.com");

    @Test
    void createPatientTest() {
        assert patient != null;
    }

    @Test
    void dontCreatePatientWithNullParams() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Patient(patient.getName(), "", patient.getNumber(), patient.getEmail()));
    }

    @Test
    void dontCreatePatientWithWrongEmail() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Patient(patient.getName(), patient.getNumber(), patient.getNumber(), "wrongEmail"));
    }

    @Test
    void dontCreatePatientWithWrongNumber() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Patient(patient.getName(), "wrongNumber", patient.getNumber(), patient.getEmail()));
    }

    @Test
    void dontCreatePatientWithWrongCpf() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Patient(patient.getName(), "wrongCpf", patient.getNumber(), patient.getEmail()));
    }

    @Test
    void createPatientFactory(){
        PatientFactory patientFactory = new PatientFactory();
        Patient patient = patientFactory.createPatient("Kaique Rierickson Torres", "706.706.706-06", "(81) 99999-9999", "riericksontorres@gmail.com");
        Assertions.assertNotNull(patient);

        patientFactory.createPatientWithAddress("Rua Manoel Gomes do Nascimento", "320", "Boa Vista", "Belo Jardim", "PE");
    }
}
