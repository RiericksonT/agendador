package com.gabipsi.agendamentos.domain.entities;

import com.gabipsi.agendamentos.domain.entities.patient.Patient;
import com.gabipsi.agendamentos.domain.entities.psychologist.Psychologist;
import com.gabipsi.agendamentos.domain.entities.scheduling.Scheduling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SchedulingTest {
    private Patient patient = new Patient("Kaique Rierickson Torres", "706.706.706-06", "(81) 99999-9999", "riericksontorres@gmail.com");
    private Psychologist psychologist = new Psychologist("Gabriela Xavier", "CRP 22/2222", "gxtavares7@gmail.com", "(81) 98888-8888");
    private Scheduling scheduling = new Scheduling("2025-03-16 15:30:00", patient, psychologist);

    @Test
    void createScheduling(){
        assert scheduling != null;
    }

    @Test
    void dontCreateSchedulingWithNullParams(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Scheduling(null, patient, psychologist));
    }

    @Test
    void dontCreateSchedulingWithWrongDate(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Scheduling("2025-03-11 15:30:00", patient, psychologist));
    }

    @Test
    void dontCreateSchedulingWithWrongPatient(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Scheduling(scheduling.getDate(), null, psychologist));
    }
}
