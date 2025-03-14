package com.gabipsi.agendamentos.infra.gateways.scheduling;

import com.gabipsi.agendamentos.aplication.gateway.IScheduling;
import com.gabipsi.agendamentos.domain.entities.scheduling.Scheduling;
import com.gabipsi.agendamentos.infra.persistence.scheduling.SchedulingRepositoryJpa;

import java.util.List;

public class SchedulingRepositoryImpl implements IScheduling {
    private final SchedulingRepositoryJpa repository;

    public SchedulingRepositoryImpl(SchedulingRepositoryJpa repository) {
        this.repository = repository;
    }

    @Override
    public Scheduling createScheduling(Scheduling scheduling) {
        return this.repository.save(scheduling);
    }

    @Override
    public Scheduling getSchedulingById(Long id) {
        return
    }

    @Override
    public Scheduling getSchedulingByPatientCPF(String patientCPF) {
        return null;
    }

    @Override
    public Scheduling getSchedulingByPsychologistCRP(String psychologistCRP) {
        return null;
    }

    @Override
    public List<Scheduling> getAllSchedulings() {
        return List.of();
    }

    @Override
    public Scheduling updateScheduling(Scheduling scheduling) {
        return null;
    }

    @Override
    public void deleteScheduling(Long id) {

    }
}
