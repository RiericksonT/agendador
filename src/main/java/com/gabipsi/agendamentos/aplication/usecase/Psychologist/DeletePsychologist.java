package com.gabipsi.agendamentos.aplication.usecase.Psychologist;

import com.gabipsi.agendamentos.aplication.gateway.IPsychologist;

public class DeletePsychologist {
    private final IPsychologist psychologistInterface;

    public DeletePsychologist(IPsychologist psychologistInterface) {
        this.psychologistInterface = psychologistInterface;
    }

    public void deletePsychologist(Long id){
        this.psychologistInterface.deletePsychologist(id);
    }
}
