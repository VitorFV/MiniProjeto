package org.example.mineprojeto.service;

import org.example.mineprojeto.model.Funcionario;
import org.example.mineprojeto.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;

    }

    public List<Funcionario> listar(){
        return repository.findAll();
    }

    public Funcionario salvar(Funcionario funcionario){
       return repository.save(funcionario);
    }

    public Funcionario buscar(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Funcionario nao encontrado!"));
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

    public List<Funcionario> buscarPorId(Long id){
        return repository.findByNomeContainingIgnoreCase(String.valueOf(id));
    }

}