package gui;
import datos.DatosEstudiante;
import dominio.Curso;
import dominio.Estudiante;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_AgregarEstudianteICC264 extends Ventana implements ActionListener {
    Curso curso;

    private JButton agregar;
    private JButton cancelar;

    private JTextField nombretxt;
    private JTextField emailtxt;
    private JTextField ruttxt;

    public Ventana_AgregarEstudianteICC264(Curso curso) {
        this.curso = curso;

        this.setTitle("Agregar Estudiante ICC264");

        JLabel rutLabel = this.generarEtiqueta("Rut: ", 50, 50, 100, 20);
        JLabel nombreLabel = this.generarEtiqueta("Nombre: ", 50, 100, 100, 20);
        JLabel emailLabel = this.generarEtiqueta("Email: ", 50, 150, 100, 20);

        agregar = this.generarBoton("Agregar", 50, 200, 125, 30);
        cancelar = this.generarBoton("Cancelar", 225, 200, 125, 30);

        agregar.addActionListener(this);
        cancelar.addActionListener(this);

        ruttxt = this.generarCampoDeTexto(150, 50, 200, 20);
        nombretxt = this.generarCampoDeTexto(150, 100, 200, 20);
        emailtxt = this.generarCampoDeTexto(150, 150, 200, 20);
    }

    public void agregarEstudiante() {
        if(!camposVacios()) {
            Estudiante estudiante = new Estudiante(ruttxt.getText(), nombretxt.getText(), emailtxt.getText());
            curso.añadirEstudiante(estudiante);
            DatosEstudiante.registrarDatos(estudiante, "ICC264.txt");

            JOptionPane.showMessageDialog(this, "¡El ha sido registrado exitósamente!",
                    "Vehiculos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "El estudiante no se ha podido registrar",
                    "Vehiculos", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public boolean camposVacios() {
        return ruttxt.getText().equals("") || nombretxt.getText().equals("") ||
                emailtxt.getText().equals("");
    }

    public void limpiarTextField() {
        nombretxt.setText("");
        ruttxt.setText("");
        emailtxt.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cancelar) {
            new Ventana_CursoICC264(this.curso);
            this.dispose();
        } else if(e.getSource() == agregar) {
            agregarEstudiante();
            limpiarTextField();
        }
    }
}