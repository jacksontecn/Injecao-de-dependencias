package org.example.service;

import org.example.modelo.Cliente;
import org.example.notificacao.Notificador;


public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador){
        this.notificador = notificador;
    }

    public void ativar (Cliente cliente){
        cliente.ativar();


        this.notificador.notificar(cliente,"Seu cadastro no sistema está ativo!");
    }
}
