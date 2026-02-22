package com.jsantos.certseasy.core.usecases.ports;

import com.jsantos.certseasy.core.entities.Certificado;
import java.util.List;

public interface RepositorioCertificado {
    void salvar(Certificado certificado);

    List<Certificado> listarTodos();

    //List<Certificado> listarPorCategoria(String categoria);)
}
