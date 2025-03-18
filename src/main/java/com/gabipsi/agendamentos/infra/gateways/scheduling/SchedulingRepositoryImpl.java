package com.gabipsi.agendamentos.infra.gateways.scheduling;

import com.gabipsi.agendamentos.aplication.gateway.IScheduling;
import com.gabipsi.agendamentos.domain.entities.scheduling.Scheduling;
import com.gabipsi.agendamentos.infra.persistence.scheduling.SchedulingEntity;
import com.gabipsi.agendamentos.infra.persistence.scheduling.SchedulingRepositoryJpa;

import java.util.List;
import java.util.UUID;

public class SchedulingRepositoryImpl implements IScheduling {
    private final SchedulingRepositoryJpa repository;
    private final SchedulingMapper mapper;

    public SchedulingRepositoryImpl(SchedulingRepositoryJpa repository, SchedulingMapper mapper) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public Scheduling createScheduling(Scheduling scheduling) {
        return mapper.fromEntityToDomain(this.repository.save(mapper.fromDomainToEntity(scheduling)));
    }

    @Override
    public Scheduling getSchedulingById(UUID id) {
        return mapper.fromEntityToDomain(this.repository.findById(id));
    }

    @Override
    public Scheduling getSchedulingByPatientCPF(String patientCPF) {
        return mapper.fromEntityToDomain(this.repository.findByPatient_Cpf(patientCPF));
    }

    @Override
    public Scheduling getSchedulingByPsychologistCRP(String psychologistCRP) {
        return mapper.fromEntityToDomain(this.repository.findByPsychologist_Crp(psychologistCRP));
    }

    @Override
    public List<Scheduling> getAllSchedulings() {
        List<SchedulingEntity> schedulingEntities = this.repository.findAll();
        return schedulingEntities.stream().map(mapper::fromEntityToDomain).toList();
    }

    @Override
    public Scheduling updateScheduling(Scheduling scheduling) {
        return mapper.fromEntityToDomain(this.repository.save(mapper.fromDomainToEntity(scheduling)));
    }

    @Override
    public void deleteScheduling(Long id) {
        this.repository.deleteById(id);
    }
}
