package edu.es.eoi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EntidadDto {	
	
	@JsonProperty(value = "field")
	private String campo;
	
	private Double number;	
	
	private String entity2;

}
