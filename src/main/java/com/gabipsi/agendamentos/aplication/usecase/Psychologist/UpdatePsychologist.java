package com.gabipsi.agendamentos.aplication.usecase.Psychologist;

import com.gabipsi.agendamentos.aplication.gateway.IPsychologist;
import com.gabipsi.agendamentos.domain.entities.psychologist.Psychologist;

public class UpdatePsychologist {
    private final IPsychologist psychologistInterface;

    public UpdatePsychologist(IPsychologist psychologistInterface) {
        this.psychologistInterface = psychologistInterface;
    }

    public Psychologist updatePsychologist(Psychologist psychologist){
        return psychologistInterface.updatePsychologist(psychologist);
    }
}
