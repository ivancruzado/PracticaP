package modelo.vista;



import modelo.Controller.FuncionController;
import modelo.Controller.PeliculasController;
import modelo.DTO.FuncionDTO;
import modelo.DTO.PeliculaDTO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class EntradasPelicula extends JFrame{

    JPanel panel1;
    FuncionController controller;
    PeliculasController controller2;
    public EntradasPelicula(){
        setSize(650,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Agenda Electronica");
        setLocationRelativeTo(null);
        componentes();
        controller = FuncionController.getInstance();
        controller2 = PeliculasController.getInstance();
        this.setVisible(true);
    }

    private void componentes(){
        paneles();
        botones();
    }

    private void paneles(){
        panel1 = new JPanel();
        panel1.setBackground(Color.white);;
        panel1.setLayout(null);
        add(panel1);
    }

    //lista desplegable de peliculas a elegir

    private void botones(){
        JLabel peliculas = new JLabel("Elija la pelicula");

        JComboBox<String> listaDesplegable= new JComboBox<>();
        List<PeliculaDTO> lista = PeliculasController.getInstance().getAll();
        listaDesplegable.addItem(null);
        for(PeliculaDTO listas:lista){
            listaDesplegable.addItem(listas.getPeliculaID());
        }

        peliculas.setBounds(100,10,100,30);
        listaDesplegable.setBounds(200,10,100,30);
        panel1.add(peliculas);
        panel1.add(listaDesplegable);
        JLabel labelFuncion = new JLabel("Funciones");

        listaDesplegable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccionado = listaDesplegable.getItemAt(listaDesplegable.getSelectedIndex());
                if (seleccionado != "0"){
                    List<FuncionDTO> listaFunciones = FuncionController.getInstance().getAll();
                    JComboBox<String> funcionCBX = new JComboBox<>();
                    for(FuncionDTO funcione:listaFunciones){
                        funcionCBX.addItem(funcione.getHorario());
                    }
                    labelFuncion.setBounds(100,100,100,30);
                    funcionCBX.setBounds(200,100,100,30);


                    panel1.add(funcionCBX);
                    panel1.add(labelFuncion);
                    JLabel asientosDisp = new JLabel("asientos libres");
                    JLabel asiento = new JLabel();

                    funcionCBX.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String horSelect = funcionCBX.getItemAt(funcionCBX.getSelectedIndex());
                            int idFuncion = 0;
                            for(FuncionDTO funcione:listaFunciones){
                                if(funcione.getHorario() == horSelect){
                                    idFuncion = funcione.getFuncionID();
                                }
                            }
                            asiento.setText(String.valueOf(controller.obtenerAsientosDisponiblePorFuncion(idFuncion)));
                        }
                    });


                    asientosDisp.setBounds(100,150,100,30);
                    asiento.setBounds(200,150,100,30);
                    panel1.add(asiento);
                    panel1.add(asientosDisp);

                    panel1.repaint();
            }}
        });
    }
}
