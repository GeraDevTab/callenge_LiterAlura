package com.aluracursos.challengeliteralura.principal;

import com.aluracursos.challengeliteralura.model.DatosLibro;
import com.aluracursos.challengeliteralura.model.Libro;
import com.aluracursos.challengeliteralura.service.ConsumoAPI;
import com.aluracursos.challengeliteralura.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private final String URL_BASE = "https://gutendex.com/books/?search=";

    private ConvierteDatos conversor = new ConvierteDatos();

    //metodos
    public void muestraElMenu(){

        var opcion = -1;
        while(opcion!=0){
            var menu = """
                    1- Buscar libro por titulo
                    2- Listado de los libros buscados
                    3- Lista de autores
                    4- listar autores vivos en determinado año
                    5- Cantidad de libro en un determinado idioma
                    0- Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    buscarLibro();
                    break;
                case 2:
                    //buscarEpisodiosPorSerie();
                    break;
                case 3:
                    //mostrarSeriesBuscadas();
                    break;
                case 4:
                    //buscarSeriesPorTitulo();
                    break;
                case 5:
                    //buscarTop5Series();
                    break;
                case 6:
                    //burcarSeriesPorCategoria();
                    break;
                case 7:
                    //filtrarSeriePorTemporadaYEvaluacion();
                    break;
                case 8:
                    //buscarEpisodiosPorNombre();
                    break;
                case 9:
                    //buscarTop5Episodios();
                    break;
                case 0:
                    System.out.println("Cerrando aplicacion");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }

    }

    private void buscarLibro() {
        DatosLibro datosLibro = obtenerDatosLibro();
        Libro libro = new Libro(datosLibro);
        System.out.println("impresion de datos libro: "+ datosLibro);
    }

    private DatosLibro obtenerDatosLibro(){
        System.out.println("Por favor escribe el nombre del libro que desea buscar");

        //Busca los datos generales de las series
        var nombreLibro = teclado.nextLine();
        var json = consumoAPI.obtenerDatos(URL_BASE + nombreLibro);

        //aqui puede ser recibir cualquier clase, y en este caso ponemos datosSerie
        var datos = conversor.obtenerDatos(json, DatosLibro.class);
        System.out.println(json);
        System.out.println(datos);
        return datos;
    }
}
