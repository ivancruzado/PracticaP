package modelo.DTO;

import modelo.modelo.Entrada;
import modelo.modelo.Sala;

import java.util.Date;
import java.util.List;

public class FuncionDTO {


    public FuncionDTO(Date fecha, int funcionID, String horario, List<Entrada> entradas, Sala sala) {

        this.entradas = entradas;
        this.fecha = fecha;
        this.funcionID = funcionID;
        this.horario = horario;
        this.sala = sala;

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

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public Sala getSala() {
        return sala;
    }
}
