package com.gabipsi.agendamentos.infra.persistence.psychologist;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class WorkScheduleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String dayOfWeek;

    @Column(nullable = false)
    private LocalTime startTime;

    @Column(nullable = false)
    private LocalTime endTime;

    @ManyToMany(mappedBy = "workSchedules")
    private Set<PsychologistEntity> psychologists = new HashSet<>();

    public WorkScheduleEntity() {}

    public WorkScheduleEntity(String dayOfWeek, LocalTime startTime, LocalTime endTime, Set<PsychologistEntity> psychologists) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.psychologists = psychologists;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Set<PsychologistEntity> getPsychologists() {
        return psychologists;
    }

    public void setPsychologist(Set<PsychologistEntity> psychologist) {
        this.psychologists = psychologist;
    }
}

