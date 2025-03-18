package com.gabipsi.agendamentos.infra.persistence.scheduling;

import com.gabipsi.agendamentos.domain.entities.scheduling.Scheduling;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SchedulingRepositoryJpa extends JpaRepository<SchedulingEntity, Long> {
    SchedulingEntity findById(UUID id);
    SchedulingEntity findByPatient_Cpf(String cpf);
    SchedulingEntity findByPsychologist_Crp(String crp);
}
