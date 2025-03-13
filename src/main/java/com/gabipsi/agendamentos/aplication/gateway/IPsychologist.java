package com.gabipsi.agendamentos.aplication.gateway;

import com.gabipsi.agendamentos.domain.entities.psychologist.Psychologist;

import java.util.List;

public interface IPsychologist {
    Psychologist createPsychologist(Psychologist psychologist);
    Psychologist getPsychologistByCRP(String crp);
    List<Psychologist> getAllPsychologists();
    Psychologist updatePsychologist(Psychologist psychologist);
    void deletePsychologist(Long id);
}
