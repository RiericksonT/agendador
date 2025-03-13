package com.gabipsi.agendamentos.aplication.usecase.Scheduling;

import com.gabipsi.agendamentos.aplication.gateway.IScheduling;
import com.gabipsi.agendamentos.domain.entities.scheduling.Scheduling;

public class CreateScheduling {
    private final IScheduling schedulingInterface;

    public CreateScheduling(IScheduling schedulingInterface) {
        this.schedulingInterface = schedulingInterface;
    }

    public Scheduling createScheduling(Scheduling scheduling){
        return schedulingInterface.createScheduling(scheduling);
    }
}
