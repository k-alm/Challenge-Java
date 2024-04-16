package br.com.fiap.anallyzer.apianallyzer.dtos;

import br.com.fiap.anallyzer.apianallyzer.entities.Empresa;
import br.com.fiap.anallyzer.apianallyzer.entities.Regiao;

public record CampanhaResponseDto(Long id, CriarCampanhaDto campanha, Empresa empresa, Regiao regiao) {

}
