package com.gabipsi.agendamentos.aplication.usecase.Psychologist;

import com.gabipsi.agendamentos.aplication.gateway.IPsychologist;
import com.gabipsi.agendamentos.domain.entities.psychologist.Psychologist;

import java.util.List;

public class GetPsychologist {
    private final IPsychologist psychologistInterface;

    public GetPsychologist(IPsychologist psychologistInterface) {
        this.psychologistInterface = psychologistInterface;
    }

    public Psychologist getPsychologistByCRP(Long id){
        return psychologistInterface.getPsychologistByCRP(id.toString());
    }

    public List<Psychologist> getAllPsychologists(){
        return psychologistInterface.getAllPsychologists();
    }
}
