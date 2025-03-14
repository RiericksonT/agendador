package com.gabipsi.agendamentos.infra.persistence.scheduling;

import com.gabipsi.agendamentos.infra.persistence.patient.PatientEntity;
import com.gabipsi.agendamentos.infra.persistence.psychologist.PsychologistEntity;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "scheduling")
public class SchedulingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String date;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientEntity patient;  // 🔥 Agora está mapeado corretamente!

    @ManyToOne
    @JoinColumn(name = "psychologist_id", nullable = false)
    private PsychologistEntity psychologist;  // 🔥 Correção aqui também

    public SchedulingEntity() {
    }

    public SchedulingEntity(String date, PatientEntity patient, PsychologistEntity psychologist) {
        this.date = date;
        this.patient = patient;
        this.psychologist = psychologist;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PatientEntity getPatient() {
        return patient;
    }

    public void setPatient(PatientEntity patient) {
        this.patient = patient;
    }

    public PsychologistEntity getPsychologist() {
        return psychologist;
    }

    public void setPsychologist(PsychologistEntity psychologist) {
        this.psychologist = psychologist;
    }
}
