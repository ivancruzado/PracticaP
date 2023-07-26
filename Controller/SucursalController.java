package modelo.Controller;


import java.util.*;

import modelo.modelo.*;

/**
 * 
 */
public class SucursalController {

	
	private static List<Sucursal> sucursal;

    private static SucursalController SINGLETON;

    private SucursalController(){};

    public static SucursalController getInstance() {

        if (SINGLETON == null){
            SINGLETON = new SucursalController();
            initSucursales();
        }
        return SINGLETON;

    };

    private static void initSucursales(){
        sucursal = new ArrayList<Sucursal>();
        sucursal.add(new Sucursal(1, "Barracas", "Av Montes de Oca 1100", null));
    }

    /**
     * @param id 
     * @param denom 
     * @param dir
     */
    public void agregarSucursal(int id, String denom, String dir) {
        // TODO implement here
    }

    /**
     * @param idSucursal 
     * @param salaID 
     * @param denom 
     * @param nroasientos
     */
    public void agregarSala(int idSucursal, int salaID, String denom, int nroasientos) {
        // TODO implement here
    }

}