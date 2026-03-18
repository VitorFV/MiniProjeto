package org.example.mineprojeto.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nao pode ser vazio!")
    private String nome;

    @NotBlank(message = "Nao pode ser vazio!")
    private String cargo;

    @NotBlank(message = "Email deve ser valido!")
    private String email;

    @NotBlank(message = "Deve ser maior que zero!")
    private Double salario;
}
