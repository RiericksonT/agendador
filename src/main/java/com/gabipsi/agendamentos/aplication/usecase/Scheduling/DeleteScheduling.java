package com.gabipsi.agendamentos.aplication.usecase.Scheduling;

import com.gabipsi.agendamentos.aplication.gateway.IScheduling;

public class DeleteScheduling {
    private final IScheduling schedulingInterface;

    public DeleteScheduling(IScheduling schedulingInterface) {
        this.schedulingInterface = schedulingInterface;
    }

    public void deleteScheduling (Long id){
        this.schedulingInterface.deleteScheduling(id);
    }
}
