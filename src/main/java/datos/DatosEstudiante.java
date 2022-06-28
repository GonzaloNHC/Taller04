package datos;

import dominio.Estudiante;
import utils.DigitoVerificador;
import utils.ValidadorEmail;

import java.util.List;

public class DatosEstudiante {
    private List<Estudiante> estudiantes;

    public DatosEstudiante(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public boolean añadirEstudiante(Estudiante estudiante){
        if(DigitoVerificador.validarRut(estudiante.getRut())&& ValidadorEmail.validaEmail(estudiante.getCorre())){
            this.estudiantes.add(estudiante);
            return true;
        }
        return false;
    }
}
