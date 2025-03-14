package com.gabipsi.agendamentos.aplication.usecase.Scheduling;

import com.gabipsi.agendamentos.aplication.gateway.IPatient;
import com.gabipsi.agendamentos.aplication.gateway.IScheduling;
import com.gabipsi.agendamentos.aplication.usecase.Patient.CreatePatient;
import com.gabipsi.agendamentos.aplication.usecase.Patient.GetPatient;
import com.gabipsi.agendamentos.domain.entities.patient.Patient;
import com.gabipsi.agendamentos.domain.entities.scheduling.Scheduling;
import org.springframework.dao.DuplicateKeyException;

public class CreateScheduling {
    private final IScheduling schedulingInterface;
    private final CreatePatient createPatient;
    private final GetPatient getPatient;

    public CreateScheduling(IScheduling schedulingInterface, CreatePatient createPatient, GetPatient getPatient) {
        this.schedulingInterface = schedulingInterface;
        this.createPatient = createPatient;
        this.getPatient = getPatient;
    }

    public Scheduling createScheduling(Scheduling scheduling){
        Scheduling schedulingExists = schedulingInterface.getSchedulingByPatientCPF(scheduling.getPatient().getCpf());
        if (schedulingExists != null){
            throw new DuplicateKeyException("This schedule already exists");
        }

        Patient patient = getPatient.getPatientByCPF(scheduling.getPatient().getCpf());
        if (patient == null) {
            Patient patientCreated = createPatient.createPatient(scheduling.getPatient());
        }
        return schedulingInterface.createScheduling(scheduling);
    }
}