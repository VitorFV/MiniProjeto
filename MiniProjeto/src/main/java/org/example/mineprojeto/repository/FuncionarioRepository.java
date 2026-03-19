package org.example.mineprojeto.repository;

import org.example.mineprojeto.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

    public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
        List<Funcionario> findByNomeContainingIgnoreCase(String nome);

}
