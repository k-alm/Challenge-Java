package br.com.fiap.anallyzer.apianallyzer.dtos;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CriarClienteDto (
	@NotBlank() String nome,
	@NotBlank() String email,
	@NotNull() LocalDate dtNascimento,
	@NotNull() Long idGenero,
	@NotNull() Long idEstadoCivil,
	@NotNull() Long idEscolaridade,
	@NotNull() Long idCampanha
) {
	
}
