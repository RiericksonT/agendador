package com.gabipsi.agendamentos.infra.persistence.patient;


import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepositoryJPA extends JpaRepository<PatientEntity, Long> {
    PatientEntity findByCpf(String cpf);
}
