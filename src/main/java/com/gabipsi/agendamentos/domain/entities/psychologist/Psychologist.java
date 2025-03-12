package com.gabipsi.agendamentos.domain.entities.psychologist;

import com.gabipsi.agendamentos.domain.entities.WorkSchedule;

import java.util.List;

public class Psychologist {
    private String name;
    private String crp;
    private String email;
    private String phone;
    private List<WorkSchedule> workSchedules;
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

    public List<WorkSchedule> getWorkSchedules() {
        return workSchedules;
    }

    public void setWorkSchedules(List<WorkSchedule> workSchedules) {
        this.workSchedules = workSchedules;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
