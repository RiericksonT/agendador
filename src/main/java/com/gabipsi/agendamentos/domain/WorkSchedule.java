package com.gabipsi.agendamentos.domain;

import com.gabipsi.agendamentos.domain.entities.psychologist.Psychologist;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class WorkSchedule {
    private UUID id;
    private String dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
    private HashSet<Psychologist> psychologists = new HashSet<>();

    public WorkSchedule(UUID id, String dayOfWeek, LocalTime startTime, LocalTime endTime, HashSet<Psychologist> psychologists) {
        this.id = id;
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

    public Set<Psychologist> getPsychologists() {
        return psychologists;
    }

    public void setPsychologists(HashSet<Psychologist> psychologists) {
        this.psychologists = psychologists;
    }
}
