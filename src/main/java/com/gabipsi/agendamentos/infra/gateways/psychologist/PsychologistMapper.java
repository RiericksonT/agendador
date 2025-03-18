package com.gabipsi.agendamentos.infra.gateways.psychologist;

import com.gabipsi.agendamentos.domain.WorkSchedule;
import com.gabipsi.agendamentos.domain.entities.psychologist.Psychologist;
import com.gabipsi.agendamentos.domain.entities.psychologist.PsychologistFactory;
import com.gabipsi.agendamentos.infra.persistence.psychologist.PsychologistEntity;
import com.gabipsi.agendamentos.infra.persistence.psychologist.WorkScheduleEntity;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PsychologistMapper {

    public PsychologistEntity fromDomainToEntity(Psychologist psychologist) {
        return new PsychologistEntity(
                psychologist.getName(),
                psychologist.getCrp(),
                psychologist.getEmail(),
                psychologist.getPhone(),
                mapWorkSchedulesToEntities(psychologist.getWorkSchedules(), psychologist),
                psychologist.getPassword()
        );
    }

    public Psychologist fromEntityToDomain(PsychologistEntity psychologistEntity){
        PsychologistFactory factory = new PsychologistFactory();
        Psychologist psychologist = factory.createPsychologist(
                psychologistEntity.getName(),
                psychologistEntity.getCrp(),
                psychologistEntity.getPhone(),
                psychologistEntity.getEmail()
        );
        factory.createPsychologistWithWorkScheduleAndPassword(
                psychologist.getWorkSchedules(),
                psychologist.getPassword()
        );

        return psychologist;
    }

    private HashSet<WorkScheduleEntity> mapWorkSchedulesToEntities(HashSet<WorkSchedule> workSchedules, Psychologist psychologist) {
        if (workSchedules == null) {
            return new HashSet<>();
        }
        return (HashSet<WorkScheduleEntity>) workSchedules.stream()
                .map(workSchedule -> {
                    WorkScheduleEntity entity = new WorkScheduleEntity(
                            workSchedule.getDayOfWeek(),
                            workSchedule.getStartTime(),
                            workSchedule.getEndTime(),
                            new HashSet<>()
                    );
                    entity.getPsychologists().add(fromDomainToEntity(psychologist));
                    return entity;
                })
                .collect(Collectors.toSet());
    }
}
