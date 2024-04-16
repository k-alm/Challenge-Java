package br.com.fiap.anallyzer.apianallyzer.dtos;

import br.com.fiap.anallyzer.apianallyzer.entities.Regiao;

public record EmpresaResponseDto(Long id, CriarEmpresaDto empresa, Regiao regiao){

}
