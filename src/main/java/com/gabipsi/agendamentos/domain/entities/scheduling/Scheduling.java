package com.gabipsi.agendamentos.domain.entities.scheduling;

import com.gabipsi.agendamentos.domain.entities.patient.Patient;
import com.gabipsi.agendamentos.domain.entities.psychologist.Psychologist;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Scheduling {
    private String date;
    private Patient patient;
    private Psychologist psychologist;

    public Scheduling(String date, Patient patient, Psychologist psychologist) {

        if (date == null ||  patient == null || psychologist == null) {
            throw new IllegalArgumentException("Scheduling parameters cannot be null");
        }

        if (date.isEmpty() ) {
            throw new IllegalArgumentException("Scheduling parameters cannot be empty");
        }

        if (LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).isBefore(LocalDateTime.now().plusHours(1))) {
            throw new IllegalArgumentException("Scheduling date cannot be before now");
        }

        this.date = date;
        this.patient = patient;
        this.psychologist = psychologist;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Psychologist getPsychologist() {
        return psychologist;
    }

    public void setPsychologist(Psychologist psychologist) {
        this.psychologist = psychologist;
    }
}
