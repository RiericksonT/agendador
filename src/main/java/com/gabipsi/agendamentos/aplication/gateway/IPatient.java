package com.gabipsi.agendamentos.aplication.gateway;

import com.gabipsi.agendamentos.domain.entities.patient.Patient;

public interface IPatient {
    Patient createPatient(Patient patient);

    Patient getPatientByCPF(String cpf);
}
