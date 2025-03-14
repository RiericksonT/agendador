package com.gabipsi.agendamentos.infra.persistence.psychologist;

import com.gabipsi.agendamentos.domain.entities.psychologist.Psychologist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PsychologistRepositoryJPA extends JpaRepository<PsychologistEntity, Long> {
    Psychologist findByCrp(String crp);
}