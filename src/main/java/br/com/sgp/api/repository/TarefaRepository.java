package br.com.sgp.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sgp.api.model.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

    List<Tarefa> findByPrioridade(String prioridade);

    List<Tarefa> findByStatus(String status);

	Optional<Tarefa> findByTitulo(Tarefa titulo);
    
}