package com.gabipsi.agendamentos.aplication.gateway;

import com.gabipsi.agendamentos.domain.entities.scheduling.Scheduling;

import java.util.List;
import java.util.UUID;

public interface IScheduling {
    Scheduling createScheduling(Scheduling scheduling);
    Scheduling getSchedulingById(UUID id);
    Scheduling getSchedulingByPatientCPF(String patientCPF);
    Scheduling getSchedulingByPsychologistCRP(String psychologistCRP);
    List<Scheduling> getAllSchedulings();
    Scheduling updateScheduling(Scheduling scheduling);
    void deleteScheduling(Long id);
}
