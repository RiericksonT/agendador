package com.gabipsi.agendamentos.domain.entities.psychologist;

import com.gabipsi.agendamentos.domain.WorkSchedule;

import java.util.List;

public class PsychologistFactory {
    private Psychologist psychologist;

    public Psychologist createPsychologist(String name, String cpf, String number, String email) {
        this.psychologist = new Psychologist(name, cpf, number, email);
        return this.psychologist;
    }

    public Psychologist createPsychologistWithWorkSchedule(List<WorkSchedule> workScheduleList) {
        this.psychologist.setWorkSchedules(
                workScheduleList
        );
        return this.psychologist;
    }

    public Psychologist createPsychologistWithWorkScheduleAndPassword(List<WorkSchedule> workScheduleList, String password) {
        this.psychologist.setWorkSchedules(
                workScheduleList
        );
        this.psychologist.setPassword(password);
        return this.psychologist;
    }
}
