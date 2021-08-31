/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_2;

/**
 *
 * @author Luis
 */
public class Estudiante {
    String nombre;
    int numControl;
    String materia;
    double calificacion;
    String estado;
    //Constructor de la clase estudiante
    public Estudiante(String nombre,int numControl, String materia, double calificacion ){
        setNombre(nombre);
        setNumControl(numControl);
        setMateria(materia);
        setCalificacion(calificacion);
        AsignarEstado();
    }
    public void setNombre(String nombre){
	this.nombre = nombre;//El valor que esta en esta clase es igual al valor que llega como parametro 
	}
    public void setNumControl(int numControl){
	this.numControl = numControl;//El valor que esta en esta clase es igual al valor que llega como parametro 
	}
    public void setMateria(String materia){
	this.materia = materia;//El valor que esta en esta clase es igual al valor que llega como parametro 
	}
    public void setCalificacion(double calificacion){
	this.calificacion = calificacion;//El valor que esta en esta clase es igual al valor que llega como parametro 
	}
  
    public String getNombre(){
        return nombre;
	}
    public int getNumControl(){
	return numControl;
	}
    public String getMateria(){
        return materia;
	}
    public double getCalificacion(){
        return calificacion;
    }
    //Metodo publico para asignar si el alumno reprobo el curso
    public String AsignarEstado(){
        
        if(calificacion<=59)
        {
            estado="Reprobado";
        }
        else
        {
            estado="Aprobado";
        }
        return estado;
    }
    //Metodo publico para cambiar las calificaciones de los estudiantes
    public void CambiarCalificacion(float calificacion){
        this.calificacion=calificacion;
    }
   
}
