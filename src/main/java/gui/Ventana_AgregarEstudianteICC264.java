package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_AgregarEstudianteICC264 extends Ventana implements ActionListener {
    JLabel rut;
    JLabel Nombre;
    JLabel Email;
    JTextField DatoRut;
    JTextField DatoNombre;
    JTextField DatoEmail;
    JButton Agregar;
    JButton Cancelar;
    protected final String fuente = "Sabon Next LT";
    protected final int tamañoFuente = 10;

    public Ventana_AgregarEstudianteICC264(){
        rut = this.generarEtiqueta("Rut: ", 20, 100, 70, 20,
                this.fuente, this.tamañoFuente);
        DatoRut = this.generarCampoDeTexto(100,100,70,20);
        Nombre = this.generarEtiqueta("Nombre: ", 20, 150, 70, 20,
                this.fuente, this.tamañoFuente);
        DatoNombre = this.generarCampoDeTexto(100,150,70,20);
        Email = this.generarEtiqueta("Email: ", 20, 200, 70, 20,
                this.fuente, this.tamañoFuente);
        DatoEmail = this.generarCampoDeTexto(100,200,70,20);

        Agregar = this.generarBoton("Agregar",20,300,90,20);
        Agregar.addActionListener(this);

        Cancelar = this.generarBoton("Cancelar",100,300,90,20);
        Agregar.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Cancelar){
            this.dispose();


        }

    }
}
