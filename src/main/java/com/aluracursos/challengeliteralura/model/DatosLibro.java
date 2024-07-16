package com.aluracursos.challengeliteralura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(@JsonAlias("count") Integer numero,
                         @JsonAlias("results") List<DatosInformacionLibro> informacionLibros) {
}
