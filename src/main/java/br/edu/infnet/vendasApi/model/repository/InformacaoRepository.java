package br.edu.infnet.vendasApi.model.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infnet.appvenda.model.domain.Produto;

import br.edu.infnet.vendasApi.model.domain.Informacao;

@Repository
public interface InformacaoRepository extends CrudRepository<Informacao, Integer> {
	@Query("from Produto p where p.vendedor.id = :vendedorId")
	Collection<Informacao> obterLista(Integer vendedorId);
}
