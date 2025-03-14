package com.gabipsi.agendamentos.infra.persistence.patient;

import com.gabipsi.agendamentos.domain.Address;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.UUID;

@Entity
@Table(name = "patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String cpf;
    private String number;
    private String email;
    private Address address;

    public PatientEntity() {
    }

    public PatientEntity(UUID id, String name, String cpf, String number, String email, Address address) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.number = number;
        this.email = email;
        this.address = address;
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
