package com.gabipsi.agendamentos.domain.entities.psychologist;

import com.gabipsi.agendamentos.domain.WorkSchedule;

import java.util.HashSet;

public class PsychologistFactory {
    private Psychologist psychologist;

    public Psychologist createPsychologist(String name, String crp, String phone, String email) {
        this.psychologist = new Psychologist(name, crp, phone, email);
        return this.psychologist;
    }

    public void createPsychologistWithWorkSchedule(HashSet<WorkSchedule> workScheduleList) {
        this.psychologist.setWorkSchedules(
                workScheduleList
        );
    }

    public void createPsychologistWithWorkScheduleAndPassword(HashSet<WorkSchedule> workScheduleList, String password) {
        this.psychologist.setWorkSchedules(
                workScheduleList
        );
        this.psychologist.setPassword(password);
    }
}
