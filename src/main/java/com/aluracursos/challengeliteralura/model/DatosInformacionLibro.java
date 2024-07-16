package com.aluracursos.challengeliteralura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosInformacionLibro(@JsonAlias("id") Integer id,
                                    @JsonAlias("title") String titulo,
                                    @JsonAlias("download_count") Integer numeroDescargas) {
}
