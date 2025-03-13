package com.gabipsi.agendamentos.domain.entities.patient;

import com.gabipsi.agendamentos.domain.Address;

public class PatientFactory {
    private Patient patient;


    public Patient createPatient(String name, String cpf, String number, String email) {
        this.patient = new Patient(name, cpf, number, email);
        return this.patient;
    }

    public Patient createPatientWithAddress(String street, String number, String neighborhood, String city, String state) {
        this.patient.setAddress(new Address(street, number, neighborhood, city, state));
        return this.patient;
    }
}
