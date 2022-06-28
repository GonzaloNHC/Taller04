package dominio;

import utils.DigitoVerificador;
import utils.ValidadorEmail;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private List<Estudiante> estudiantes;

    public Curso () {
        this.estudiantes = new ArrayList<>();
    }

    public boolean añadirEstudiante(Estudiante estudiante){
        if(DigitoVerificador.validarRut(estudiante.getRut())&& ValidadorEmail.validaEmail(estudiante.getEmail())){
            this.estudiantes.add(estudiante);
            return true;
        }
        return false;
    }

    public boolean estudianteExiste(String rut) {
        for (Estudiante e: this.estudiantes) {
            if(e.getRut().equals(rut)) {
                return true;
            }
        }

        return false;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Estudiante buscarEstudiantePorRut(String rut) throws EstudianteNoEncontradoException{
        for (Estudiante e: this.estudiantes) {
            if(e.getRut().equals(rut)) {
                return e;
            }
        }

        throw new EstudianteNoEncontradoException();
    }
}