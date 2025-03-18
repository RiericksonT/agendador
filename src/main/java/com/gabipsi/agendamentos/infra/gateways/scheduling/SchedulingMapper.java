package com.gabipsi.agendamentos.infra.gateways.scheduling;

import com.gabipsi.agendamentos.domain.entities.scheduling.Scheduling;
import com.gabipsi.agendamentos.infra.gateways.patient.PatientMapper;
import com.gabipsi.agendamentos.infra.gateways.psychologist.PsychologistMapper;
import com.gabipsi.agendamentos.infra.persistence.scheduling.SchedulingEntity;

public class SchedulingMapper {
    private final PatientMapper patientMapper;
    private final PsychologistMapper psychologistMapper;

    public SchedulingMapper(PatientMapper patientMapper, PsychologistMapper psychologistMapper) {
        this.patientMapper = patientMapper;
        this.psychologistMapper = psychologistMapper;
    }

    public Scheduling fromEntityToDomain(SchedulingEntity schedulingEntity){
        return new Scheduling(
                schedulingEntity.getDate(),
                patientMapper.fromEntityToDomain(schedulingEntity.getPatient()),
                psychologistMapper.fromEntityToDomain(schedulingEntity.getPsychologist())
        );
    }

    public SchedulingEntity fromDomainToEntity(Scheduling scheduling){
        return new SchedulingEntity(
                scheduling.getDate(),
                patientMapper.fromDomainToEntity(scheduling.getPatient()),
                psychologistMapper.fromDomainToEntity(scheduling.getPsychologist())
        );
    }
}
