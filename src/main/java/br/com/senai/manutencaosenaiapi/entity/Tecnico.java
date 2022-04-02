package br.com.senai.manutencaosenaiapi.entity;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Tecnico {
	
	@Getter
	@EqualsAndHashCode.Include
	private Integer id;
	
	@Getter @Setter
	private String nomeCompleto;
	
	@Getter @Setter
	private LocalDate dataDeAdmissao;
	

}
