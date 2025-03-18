package com.gabipsi.agendamentos.domain.entities.psychologist;

import com.gabipsi.agendamentos.domain.WorkSchedule;

import java.util.HashSet;
import java.util.UUID;

public class Psychologist {
    private UUID id;
    private String name;
    private String crp;
    private String email;
    private String phone;
    private HashSet<WorkSchedule> workSchedules;
    private String password;

    public Psychologist() {
    }

    public Psychologist(String name, String crp, String email, String phone) {

        if (name == null || crp == null || email == null || phone == null) {
            throw new IllegalArgumentException("Arguments must not be null");
        }

        if (!crp.matches("^CRP \\d{2}/\\d{1,5}$")) {
            throw new IllegalArgumentException("CRP does not match the required format");
        }

        if (!phone.matches("\\(\\d{2}\\)\\s9\\d{4}-\\d{4}")) {
            throw new IllegalArgumentException("Phone number does not match the required format");
        }

        if (!email.matches("^[a-zA-Z0-9._%+-]+@gmail+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Email does not match the required format");
        }

        this.name = name;
        this.crp = crp;
        this.email = email;
        this.phone = phone;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public HashSet<WorkSchedule> getWorkSchedules() {
        return workSchedules;
    }

    public void setWorkSchedules(HashSet<WorkSchedule> workSchedules) {
        this.workSchedules = workSchedules;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
