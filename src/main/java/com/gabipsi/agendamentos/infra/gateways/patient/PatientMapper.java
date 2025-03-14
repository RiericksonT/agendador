package com.gabipsi.agendamentos.infra.gateways.patient;

import com.gabipsi.agendamentos.domain.entities.patient.Patient;
import com.gabipsi.agendamentos.domain.entities.patient.PatientFactory;
import com.gabipsi.agendamentos.infra.persistence.patient.PatientEntity;

public class PatientMapper {
    public PatientEntity fromDomainToEntity(Patient patient){
        return new PatientEntity(
                patient.getId(),
                patient.getName(),
                patient.getCpf(),
                patient.getNumber(),
                patient.getEmail(),
                patient.getAddress()
        );
    }

    public Patient fromEntityToDomain(PatientEntity patientEntity){
        PatientFactory factory = new PatientFactory();
        Patient patient = factory.createPatient(
                patientEntity.getName(),
                patientEntity.getCpf(),
                patientEntity.getNumber(),
                patientEntity.getEmail()
        );
        return factory.createPatientWithAddress
                (patientEntity.getAddress().getStreet(), patientEntity.getAddress().getNumber(),
                        patientEntity.getAddress().getNeighborhood(), patientEntity.getAddress().getCity(),
                        patientEntity.getAddress().getState());
    }
}
