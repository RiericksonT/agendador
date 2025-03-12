package com.gabipsi.agendamentos.domain.entities;

import com.gabipsi.agendamentos.domain.entities.psychologist.Psychologist;
import com.gabipsi.agendamentos.domain.entities.psychologist.PsychologistFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PsychologistTest {
    Psychologist psychologist = new Psychologist("Gabriela Xavier", "CRP 22/2222", "gxtavares7@gmail.com", "(81) 98888-8888");

    @Test
    void createPsychologist() {
        assert psychologist != null;
    }

    @Test
    void dontCreatePsychologistWithWrongCRP() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Psychologist(psychologist.getName(), "wrongCRP", psychologist.getEmail(), psychologist.getPhone()));
    }

    @Test
    void dontCreatePsychologistWithWrongEmail() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Psychologist(psychologist.getName(), psychologist.getCrp(), "wrongEmail", psychologist.getPhone()));
    }

    @Test
    void dontCreatePsychologistWithWrongPhone() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Psychologist(psychologist.getName(), psychologist.getCrp(), psychologist.getEmail(), "wrongPhone"));
    }

    @Test
    void createPsychologistFactory(){
        List<WorkSchedule> workScheduleList = new ArrayList<>();
        workScheduleList.add(new WorkSchedule("Thuesday", "14:00", "20:00"));
        workScheduleList.add(new WorkSchedule("Wednesday", "14:00", "20:00"));
        PsychologistFactory psychologistFactory = new PsychologistFactory();
        Psychologist psychologist = psychologistFactory.createPsychologist("Gabriela Xavier", "CRP 22/22222", "gxtavares7@gmail.com", "(81) 98888-8888");
        Assertions.assertNotNull(psychologist);

        psychologistFactory.createPsychologistWithWorkSchedule(
                workScheduleList
        );
        assert psychologist.getWorkSchedules() != null;

        psychologistFactory.createPsychologistWithWorkScheduleAndPassword(
               workScheduleList,
                "password"
        );
        assert psychologist.getWorkSchedules() != null;
        assert psychologist.getPassword() != null;
    }
}
