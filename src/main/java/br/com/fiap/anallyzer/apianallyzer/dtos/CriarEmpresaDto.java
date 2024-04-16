package br.com.fiap.anallyzer.apianallyzer.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CriarEmpresaDto(@NotNull() Long idRegiao, @NotBlank() String nome, @NotBlank() String cnpj, @NotBlank() String contato) {}
