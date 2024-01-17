package com.algaworks.algafood.jpa.permissao;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.FormaPagamento;
import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.FormaPagamentoRepository;
import com.algaworks.algafood.domain.repository.PermissaoRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class BuscaPermissaoMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        PermissaoRepository permissaoRepository = applicationContext.getBean(PermissaoRepository.class);
        Permissao permissao = permissaoRepository.buscar(1l);
        System.out.println(permissao.getNome() + ": " + permissao.getDescricao());
    }
}
