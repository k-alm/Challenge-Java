package br.com.fiap.anallyzer.apianallyzer.dtos;

import jakarta.validation.constraints.NotBlank;

public record UpdateCampanhaReponseDto(@NotBlank String titulo, @NotBlank String descricao) {

}
