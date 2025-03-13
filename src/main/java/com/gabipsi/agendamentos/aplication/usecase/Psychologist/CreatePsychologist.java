package com.gabipsi.agendamentos.aplication.usecase.Psychologist;

import com.gabipsi.agendamentos.aplication.gateway.IPsychologist;
import com.gabipsi.agendamentos.domain.entities.psychologist.Psychologist;

public class CreatePsychologist {
    private final IPsychologist psychologistInterface;

    public CreatePsychologist(IPsychologist psychologistInterface) {
        this.psychologistInterface = psychologistInterface;
    }

    public Psychologist createPsychologist(Psychologist psychologist){
        return psychologistInterface.createPsychologist(psychologist);
    }
}
