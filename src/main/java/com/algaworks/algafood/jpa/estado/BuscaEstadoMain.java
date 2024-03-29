package com.algaworks.algafood.jpa.estado;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class BuscaEstadoMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        EstadoRepository estadoRepository = applicationContext.getBean(EstadoRepository.class);
        Estado estado = estadoRepository.buscar(2l);
        System.out.println(estado.getNome());
    }
}
