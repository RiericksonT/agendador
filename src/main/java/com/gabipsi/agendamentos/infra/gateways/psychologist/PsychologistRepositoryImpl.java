package com.gabipsi.agendamentos.infra.gateways.psychologist;

import com.gabipsi.agendamentos.aplication.gateway.IPsychologist;
import com.gabipsi.agendamentos.domain.entities.psychologist.Psychologist;
import com.gabipsi.agendamentos.infra.persistence.psychologist.PsychologistRepositoryJPA;

import java.util.List;

public class PsychologistRepositoryImpl implements IPsychologist {
    private final PsychologistRepositoryJPA repository;

    public PsychologistRepositoryImpl(PsychologistRepositoryJPA repository) {
        this.repository = repository;
    }

    @Override
    public Psychologist createPsychologist(Psychologist psychologist) {
        return this.repository.save(psychologist);
    }

    @Override
    public Psychologist getPsychologistByCRP(String crp) {
        return this.repository.findByCrp(crp);
    }

    @Override
    public List<Psychologist> getAllPsychologists() {
        return this.repository.findAll();
    }

    @Override
    public Psychologist updatePsychologist(Psychologist psychologist) {
        return this.repository.save(psychologist);
    }

    @Override
    public void deletePsychologist(Long id) {
        this.repository.deleteById(id);
    }
}
