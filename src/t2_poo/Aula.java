/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2_poo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author diego
 */
public class Aula {
    String nombre;
    private List<Estudiante> listaAsistencia = new ArrayList<>();
 public Aula(String nombre) {
        this.nombre = nombre;
    }
 public void tomarAsistencia(Estudiante estudiante) {
        listaAsistencia.add(estudiante);
    }
  public List<Estudiante> getListaAsistencia() {
        return listaAsistencia;
    }
}
