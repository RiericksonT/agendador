package com.gabipsi.agendamentos.domain.entities.patient;

import com.gabipsi.agendamentos.domain.Address;

public class Patient {
    private String name;
    private String cpf;
    private String number;
    private String email;
    private Address address;

    public Patient(String name, String cpf, String number, String email) {

        if (name == null || cpf == null || number == null || email == null) {
            throw new IllegalArgumentException("Arguments must not be null");
        }

        if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            throw new IllegalArgumentException("CPF does not match the required format");
        }

        if (!number.matches("\\(\\d{2}\\)\\s9\\d{4}-\\d{4}")) {
            throw new IllegalArgumentException("Phone number does not match the required format");
        }

        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Email does not match the required format");
        }

        this.name = name;
        this.cpf = cpf;
        this.number = number;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
