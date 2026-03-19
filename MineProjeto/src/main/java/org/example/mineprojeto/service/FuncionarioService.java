package org.example.mineprojeto.service;

import org.example.mineprojeto.model.Funcionario;
import org.example.mineprojeto.repository.FuncionarioRepository;

import java.util.List;
public class FuncionarioService {

    private final FuncionarioService repository;

    public FuncionarioService(FuncionarioRepository repository){
        this.repository = repository;
    }

    public Funcionario salvar(Funcionario funcionario){
        return repository.save(funcionario);
    }

    public Funcionario buscar(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionario nao encontrado!"));
    }
    public List<Funcionario> listar(){
        return repository.findAll();
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

    public List<Funcionario> buscarPorNome(String nome){
        return repository.findByNomeContainingIgnoreCase(nome);
    }

}