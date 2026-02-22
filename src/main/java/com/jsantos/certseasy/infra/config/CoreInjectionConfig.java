package com.jsantos.certseasy.infra.config;

import com.jsantos.certseasy.core.usecases.CriarCertificado;
import com.jsantos.certseasy.core.usecases.ports.ArmazenamentoArquivos;
import com.jsantos.certseasy.core.usecases.ports.RepositorioCertificado;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreInjectionConfig {
    @Bean
    public CriarCertificado criarCertificado(
            RepositorioCertificado repositorio,
            ArmazenamentoArquivos armazenamento) {
        return new CriarCertificado(repositorio, armazenamento);
    }
}
