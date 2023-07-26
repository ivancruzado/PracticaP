package modelo.modelo;

import java.util.*;

/**
 * 
 */
public class Funcion {

    /**
     * Default constructor
     */
    public Funcion(Date fecha, int funcionID, String horario, List<Entrada> entradas, Sala sala) {
    	
    	this.entradas = entradas;
    	this.fecha = fecha;
    	this.funcionID = funcionID;
    	this.horario = horario;    	
    	this.sala = sala;
    	//this.asientosReservados = asientosReservados;
    }

    /**
     * 
     */
    private int funcionID;

    /**
     * 
     */
    private String horario;

    /**
     * 
     */
    private Date fecha;

    /**
     * 
     */
    private List<Entrada> entradas;

    private Sala sala;

    //private int asientosReservados;



    /**
     * @return
     */
    public int getSalaID() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getSucursalID() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int getPeliculaID() {
        // TODO implement here
        return 0;
    }

    /**
     * 
     */
    public int getCantidadAsientosDisponibles() {
    	int asientosSala = sala.getAsientos();
        int asientoRes = entradas.size();
		return asientosSala-asientoRes;
        // TODO implement here
    }

    /**
     * @return
     */
    public int getFuncionID() {

        return this.funcionID;
    }

    /**
     * 	
     */
    public Date getFecha() {
        return fecha;
        // TODO implement here
    }

    public String getHorario() {
        return horario;
    }

    public Sala getSala() {
        return sala;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }
}