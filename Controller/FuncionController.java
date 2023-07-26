package modelo.Controller;

import modelo.DTO.FuncionDTO;
import modelo.DTO.PeliculaDTO;
import modelo.modelo.*;

import java.util.*;


public class FuncionController {
	
	private static List<Funcion> funcion;


    private static FuncionController SINGLETON;

    private FuncionController(){};

    public static FuncionController getInstance() {

        if (SINGLETON == null){
            SINGLETON = new FuncionController();
            initFunciones();
        }
        return SINGLETON;

    };

    private static void initFunciones(){
        funcion = new ArrayList<>();
        funcion.add(new Funcion(new Date(), 1, "11:00", new ArrayList<Entrada>(), new Sala(0, null, 10)));
        funcion.add(new Funcion(new Date(), 2, "14:00", new ArrayList<Entrada>(), new Sala(1, null, 5)));
        funcion.add(new Funcion(new Date(), 3, "17:00", new ArrayList<Entrada>(), new Sala(2, null, 2)));
    }

    public void ABM() {
        // TODO implement here
    }

    /**
     * @param funcionID
     * @return
     */
    public int obtenerAsientosDisponiblePorFuncion(int funcionID) {
    	int asientos = -1;
        for(int i=0;i<funcion.size();i++){
            if (funcion.get(i).getFuncionID() == funcionID){
                asientos = funcion.get(i).getCantidadAsientosDisponibles();
            }
        }

		return asientos;
    }

    public FuncionDTO toDTO(Funcion funcion){
        FuncionDTO dto = new FuncionDTO(funcion.getFecha(),funcion.getFuncionID(),funcion.getHorario(),funcion.getEntradas(),funcion.getSala());
        return dto;
    }

    public List<FuncionDTO> getAll(){
        List<FuncionDTO> listaDto= new ArrayList<>();
        for (Funcion funciones : funcion) {
            listaDto.add(toDTO(funciones));
        }
        return listaDto;
    }

    /**
     * @return
     */
    public int peliculaMasVista() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int diaDeLaSemanaConMenorVentas() {
        // TODO implement here
        return 0;
    }

}