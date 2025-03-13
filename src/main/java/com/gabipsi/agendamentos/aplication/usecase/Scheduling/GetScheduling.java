package com.gabipsi.agendamentos.aplication.usecase.Scheduling;

import com.gabipsi.agendamentos.aplication.gateway.IScheduling;
import com.gabipsi.agendamentos.domain.entities.scheduling.Scheduling;

import java.util.List;

public class GetScheduling {
    private final IScheduling schedulingInterface;

    public GetScheduling(IScheduling schedulingInterface) {
        this.schedulingInterface = schedulingInterface;
    }

    public List<Scheduling> getAllSchedulings(){
        return this.schedulingInterface.getAllSchedulings();
    }

    public Scheduling getSchedulingById(Long id){
        return this.schedulingInterface.getSchedulingById(id);
    }

    public Scheduling getSchedulingByPatientCPF(String patientCPF){
        return this.schedulingInterface.getSchedulingByPatientCPF(patientCPF);
    }

    public Scheduling getSchedulingByPsychologistCRP(String psychologistCRP){
        return this.schedulingInterface.getSchedulingByPsychologistCRP(psychologistCRP);
    }
}
