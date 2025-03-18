package com.gabipsi.agendamentos.infra.gateways.psychologist;

import com.gabipsi.agendamentos.aplication.gateway.IPsychologist;
import com.gabipsi.agendamentos.domain.entities.psychologist.Psychologist;
import com.gabipsi.agendamentos.infra.persistence.psychologist.PsychologistEntity;
import com.gabipsi.agendamentos.infra.persistence.psychologist.PsychologistRepositoryJPA;

import java.util.List;

public class PsychologistRepositoryImpl implements IPsychologist {
    private final PsychologistRepositoryJPA repository;
    private final PsychologistMapper mapper;

    public PsychologistRepositoryImpl(PsychologistRepositoryJPA repository, PsychologistMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Psychologist createPsychologist(Psychologist psychologist) {
        return mapper.fromEntityToDomain(this.repository.save(mapper.fromDomainToEntity(psychologist)));
    }

    @Override
    public Psychologist getPsychologistByCRP(String crp) {
        return this.repository.findByCrp(crp);
    }

    @Override
    public List<Psychologist> getAllPsychologists() {
        List<PsychologistEntity> psychologistEntities = this.repository.findAll();
        return psychologistEntities.stream().map(mapper::fromEntityToDomain).toList();
    }

    @Override
    public Psychologist updatePsychologist(Psychologist psychologist) {
        return mapper.fromEntityToDomain(this.repository.save(mapper.fromDomainToEntity(psychologist)));
    }

    @Override
    public void deletePsychologist(Long id) {
        this.repository.deleteById(id);
    }
}
