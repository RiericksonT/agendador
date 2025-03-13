package com.gabipsi.agendamentos.aplication.usecase.Patient;

import com.gabipsi.agendamentos.aplication.gateway.IPatient;
import com.gabipsi.agendamentos.domain.entities.patient.Patient;

public class GetPatient {
    private final IPatient patientInterface;

    public GetPatient(IPatient patientInterface) {
        this.patientInterface = patientInterface;
    }

    public Patient getPatientByCPF(String cpf){
        return patientInterface.getPatientByCPF(cpf);
    }
}
