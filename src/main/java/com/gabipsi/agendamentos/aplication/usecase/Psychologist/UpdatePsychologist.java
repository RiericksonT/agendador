package com.gabipsi.agendamentos.aplication.usecase.Psychologist;

import com.gabipsi.agendamentos.aplication.gateway.IPsychologist;
import com.gabipsi.agendamentos.domain.entities.psychologist.Psychologist;

import java.util.NoSuchElementException;

public class UpdatePsychologist {
    private final IPsychologist psychologistInterface;

    public UpdatePsychologist(IPsychologist psychologistInterface) {
        this.psychologistInterface = psychologistInterface;
    }

    public Psychologist updatePsychologist(Psychologist psychologist){
        Psychologist psychologistExists = psychologistInterface.getPsychologistByCRP(psychologist.getCrp());
        if (psychologistExists != null){
            psychologist.setId(psychologistExists.getId());
            return psychologistInterface.updatePsychologist(psychologist);
        }
        else {
            throw new NoSuchElementException("Psychologist does not exist");
        }
    }
}
