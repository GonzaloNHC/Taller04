package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_CursoICC264 extends Ventana implements ActionListener {
    JButton NuevoEstudiante;
    JLabel Nombre;
    JLabel Email;
    JComboBox Rut;

    public Ventana_CursoICC264(){
        Nombre = this.generarEtiqueta("Nombre",20,100,70,20,"Calibri",13);
        Email = this.generarEtiqueta("Email",20,150,70,20,"Calibri",13);

        NuevoEstudiante = this.generarBoton("Nuevo Estudiante",200,300,150,50);
        NuevoEstudiante.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==NuevoEstudiante) {
            this.dispose();
            Ventana_AgregarEstudianteICC264 vtn= new Ventana_AgregarEstudianteICC264();

        }
    }
}
