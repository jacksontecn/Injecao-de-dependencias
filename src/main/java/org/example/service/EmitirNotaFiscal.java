package org.example.service;

import org.example.modelo.Cliente;
import org.example.modelo.Produto;
import org.example.notificacao.Notificador;


public class EmitirNotaFiscal {

    private Notificador notificador;

    public EmitirNotaFiscal(Notificador notificador){
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto){

        notificador.notificar(cliente, "Sua nota fiscal foi emitida!");
    }
}
