package br.com.fiap.anallyzer.apianallyzer.dtos;

import java.time.LocalDate;

import br.com.fiap.anallyzer.apianallyzer.entities.Campanha;

public record ClienteResponseDto(Long id, String nome, String email, LocalDate dtNascimento, Campanha campanha) {

}
