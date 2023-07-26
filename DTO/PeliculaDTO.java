package modelo.DTO;

import modelo.modelo.TipoGenero;
import modelo.modelo.TipoProyeccion;

import java.util.List;

public class PeliculaDTO {

    public PeliculaDTO(TipoGenero generoID, String director, int duracionEnMinutos, String nombrePelicula, TipoProyeccion tipo, List<String> actores) {

        this.actores = actores;
        this.director = director;
        this.duracionEnMinutos = duracionEnMinutos;
        this.generoID = generoID;
        this.nombrePelicula = nombrePelicula;
        this.tipo = tipo;

    }

    /**
     *
     */
    private TipoGenero generoID;


    private String nombrePelicula;


    private int duracionEnMinutos;


    private String director;


    private List<String> actores;


    public TipoProyeccion tipo;




    public String getPeliculaID() {
        return nombrePelicula;
    }

}

