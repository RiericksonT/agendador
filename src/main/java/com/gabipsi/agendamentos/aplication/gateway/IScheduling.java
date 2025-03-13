package com.gabipsi.agendamentos.aplication.gateway;

import com.gabipsi.agendamentos.domain.entities.scheduling.Scheduling;

import java.util.List;

public interface IScheduling {
    Scheduling createScheduling(Scheduling scheduling);
    Scheduling getSchedulingById(Long id);
    Scheduling getSchedulingByPatientCPF(String patientCPF);
    Scheduling getSchedulingByPsychologistCRP(String psychologistCRP);
    List<Scheduling> getAllSchedulings();
    Scheduling updateScheduling(Scheduling scheduling);
    void deleteScheduling(Long id);
}
