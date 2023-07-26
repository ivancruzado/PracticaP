package modelo.Controller;


import java.util.*;

import modelo.DTO.PeliculaDTO;
import modelo.modelo.*;

    	
public class PeliculasController {

    /**
     * Default constructor
     */
	
	private static List<Pelicula> peliculas;

    private static PeliculasController SINGLETON;

    private PeliculasController(){};

    public static PeliculasController getInstance() {

        if (SINGLETON == null){
            SINGLETON = new PeliculasController();
            initPeliculas();
        }
        return SINGLETON;

    };

    private static void initPeliculas(){
        peliculas= new ArrayList<>();
        peliculas.add(new Pelicula(TipoGenero.Terror, "director x", 180 , "Pelicula1", TipoProyeccion.DosD, Arrays.asList("Actriz Principal", "Actor Secundario")));
        peliculas.add(new Pelicula(TipoGenero.Biografica, "director y", 180 , "Pelicula2", TipoProyeccion.TresD, Arrays.asList("Actriz Principal", "Actor Secundario")));
        peliculas.add(new Pelicula(TipoGenero.Drama, "directo h", 180 , "Pelicula3", TipoProyeccion.DosD, Arrays.asList("Actriz Principal", "Actor Secundario")));
    }

    public void ABM() {
        // TODO implement here
    }

    public PeliculaDTO toDTO(Pelicula peli){
        PeliculaDTO dto = new PeliculaDTO(peli.getGeneroID(),peli.getDirector(),peli.getDuracionEnMinutos(),peli.getNombrePelicula(),peli.getTipo(),peli.getActores());
        return dto;
    }

    public List<PeliculaDTO> getAll(){
        List<PeliculaDTO> listaDto= new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            listaDto.add(toDTO(pelicula));
        }
        return listaDto;

    }

}