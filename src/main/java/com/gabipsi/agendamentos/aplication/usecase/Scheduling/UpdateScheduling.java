package com.gabipsi.agendamentos.aplication.usecase.Scheduling;

import com.gabipsi.agendamentos.aplication.gateway.IScheduling;
import com.gabipsi.agendamentos.domain.entities.scheduling.Scheduling;

public class UpdateScheduling {
    private final IScheduling schedulingInterface;

    public UpdateScheduling(IScheduling schedulingInterface) {
        this.schedulingInterface = schedulingInterface;
    }

    public Scheduling updateScheduling(Scheduling scheduling){
        return schedulingInterface.updateScheduling(scheduling);
    }
}
