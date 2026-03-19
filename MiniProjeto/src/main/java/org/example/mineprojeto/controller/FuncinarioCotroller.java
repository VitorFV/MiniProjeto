package org.example.mineprojeto.controller;


import jakarta.validation.Valid;
import org.example.mineprojeto.model.Funcionario;
import org.example.mineprojeto.service.FuncionarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Funcionarios")
//API - Metodos de envio/busca...etc
public class FuncinarioCotroller {

    private final FuncionarioService service;

    public FuncinarioCotroller(FuncionarioService service){
        this.service = service;
    }

    @GetMapping
    public List<Funcionario> listar(){
        return service.listar();
    }

    @PostMapping
    public Funcionario Cadastrar(@RequestBody @Valid Funcionario funcionario){
        return service.salvar(funcionario);
    }

    @GetMapping("/{id}")
    public Funcionario buscar(@PathVariable Long id){
        return service.buscar(id);
    }
    @PutMapping("/{id}")
    public Funcionario atualizar(@PathVariable Long id, @RequestBody @Valid Funcionario funcionario){
        funcionario.setId(id);
        return service.salvar(funcionario);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
    @GetMapping("/buscar")
    public List<Funcionario> buscarPorId(@RequestParam Long id){
        return service.buscarPorId(id);
    }
}
