package com.gabipsi.agendamentos.infra.gateways.patient;

import com.gabipsi.agendamentos.aplication.gateway.IPatient;
import com.gabipsi.agendamentos.domain.entities.patient.Patient;
import com.gabipsi.agendamentos.infra.persistence.patient.PatientRepositoryJPA;

public class PatientRepositoryImpl implements IPatient {
    private final PatientRepositoryJPA repository;
    private final PatientMapper mapper;

    public PatientRepositoryImpl(PatientRepositoryJPA repository, PatientMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Patient createPatient(Patient patient) {
        return mapper.fromEntityToDomain(this.repository.save(mapper.fromDomainToEntity(patient)));
    }

    @Override
    public Patient getPatientByCPF(String cpf) {
        return mapper.fromEntityToDomain(this.repository.findByCpf(cpf));
    }
}
