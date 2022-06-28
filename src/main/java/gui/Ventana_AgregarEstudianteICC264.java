package gui;

import datos.DatosEstudiante;
import dominio.Estudiante;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_AgregarEstudianteICC264 extends Ventana implements ActionListener {

    private DatosEstudiante estudiante;
    JLabel rut;
    JLabel Nombre;
    JLabel Email;
    JTextField DatoRut;
    JTextField DatoNombre;
    JTextField DatoEmail;
    JButton Agregar;
    JButton Cancelar;
    public Ventana_AgregarEstudianteICC264(){
        rut = this.generarEtiqueta("rut",20,100,70,20,"Calibri",17);
        DatoRut = this.generarCampoDeTexto(100,100,70,20);
        Nombre = this.generarEtiqueta("Nombre",20,150,70,20,"Calibri",17);
        DatoNombre = this.generarCampoDeTexto(100,150,70,20);
        Email = this.generarEtiqueta("Email",20,200,70,20,"Calibri",17);
        DatoEmail = this.generarCampoDeTexto(100,200,70,20);

        Agregar = this.generarBoton("Agregar",20,300,90,20);
        Agregar.addActionListener(this);

        Cancelar = this.generarBoton("Cancelar",150,300,90,20);
        Agregar.addActionListener(this);

    }

    public void registrarEstudiante() {
        Estudiante estudiante = new Estudiante(DatoNombre.getText(),DatoRut.getText(),DatoEmail.getText());

        if(this.estudiante.añadirEstudiante(estudiante)) {
            JOptionPane.showMessageDialog(this, "Cliente registrado correctamente",
                    "Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                    "El rut es incorrecto o el estudiante ya está registrado",
                    "Rut ingresado inválido", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    void limpiar(){
        DatoNombre.setText("");
        DatoRut.setText("");
        DatoEmail.setText("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Cancelar){
            this.dispose();
            Ventana_CursoICC264 vtn = new Ventana_CursoICC264();
        } else if(e.getSource()==Agregar){
            registrarEstudiante();
            limpiar();
            System.out.println(estudiante.getEstudiantes());
        }

    }
}
