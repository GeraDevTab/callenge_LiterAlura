package com.aluracursos.challengeliteralura.model;

import java.util.List;

public class Libro {

    //atributos
    private Integer numero;
    private List<DatosInformacionLibro> informacionLibros;

    //metodos
    public Libro(DatosLibro datosLibro){
        this.numero = datosLibro.numero();
        this.informacionLibros = datosLibro.informacionLibros();

    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public List<DatosInformacionLibro> getInformacionLibros() {
        return informacionLibros;
    }

    public void setInformacionLibros(List<DatosInformacionLibro> informacionLibros) {
        this.informacionLibros = informacionLibros;
    }
}
