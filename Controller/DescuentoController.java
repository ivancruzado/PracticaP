package modelo.Controller;


import java.util.*;

import modelo.modelo.CondicionesDescuento;
import modelo.modelo.Sucursal;
import modelo.modelo.TarjetaDescuento;
import modelo.modelo.TipoTarjeta;

public class DescuentoController {
	

	//private static DescuentoController instancia;
	
	private static List<CondicionesDescuento> Descuento;
	private static DescuentoController SINGLETON;

	private DescuentoController(){};
	
    public static DescuentoController getInstance() {

		if (SINGLETON == null){
			SINGLETON = new DescuentoController();
			initDescuento();

		}
		return SINGLETON;

    };

	private static void initDescuento(){
		Descuento = new ArrayList<>();
		CondicionesDescuento CondicionesDescuento = new CondicionesDescuento(new Date(12,10,1999), new Date(12,11,1999), 5, 50, TipoTarjeta.PAMI, new ArrayList<TarjetaDescuento>());
		Descuento.add(CondicionesDescuento);
	}

    /**
     * 
     */
    public void ABM() {
	}


}