package org.example;

import java.net.URI;

public class ProcessarBoletos {
    private LeituraRetorno leituraRetorno;

    public ProcessarBoletos(LeituraRetorno leituraRetorno){
        this.leituraRetorno =leituraRetorno;
    }
    public final void processar(URI nomeArquivo){
        System.out.println(leituraRetorno.lerArquivo(nomeArquivo));
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno){
        this.leituraRetorno = leituraRetorno;
    }
}
