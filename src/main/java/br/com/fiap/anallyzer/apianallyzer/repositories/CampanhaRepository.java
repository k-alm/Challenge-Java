package br.com.fiap.anallyzer.apianallyzer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.anallyzer.apianallyzer.entities.Campanha;

public interface CampanhaRepository extends JpaRepository<Campanha, Long> {
	Campanha findFirstById(Long id);
}
