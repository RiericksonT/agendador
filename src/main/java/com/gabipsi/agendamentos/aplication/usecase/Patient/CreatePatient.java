package com.gabipsi.agendamentos.aplication.usecase.Patient;

import com.gabipsi.agendamentos.aplication.gateway.IPatient;
import com.gabipsi.agendamentos.domain.entities.patient.Patient;

public class CreatePatient {
    private final IPatient patientInterface;

    public CreatePatient(IPatient patientInterface) {
        this.patientInterface = patientInterface;
    }

    public Patient createPatient(Patient patient){
        return patientInterface.createPatient(patient);
    }
}
