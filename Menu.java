/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica_2;


import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Menu{
    public static void main(String[] args){
        //Importamos la clase Scanner para poder capturar la opcion del usuario
        Scanner scanner = new Scanner(System.in);
        //Iniciamos el arreglo
        Estudiante est[]=new Estudiante[10];
        //LLenamos los primeros 5 estudiantes
        est[0]=new Estudiante("Luis",1,"Programacion",80);
        est[1]=new Estudiante("Abraham",1,"Matematicas",90);
        est[2]=new Estudiante("Fernando",1,"Administracion",50);
        est[3]=new Estudiante("Juan",1,"Algebra",30);
        est[4]=new Estudiante("Pepe",1,"Calculo",40);
        
        int opcion=0;
        do{//Ciclo para repetir el programa hasta que el usuario lo desee 
            try{
                System.out.println("-------Menu de opciones-------\n"+
                    "1. Captura de alumnos.\n" +
                    "2. Mostrar alumnos.\n" +
                    "3. Cambiar calificacion.\n" +       //Impresion de las opciones del menu
                    "4. Salir.\n" );
                System.out.println("ingrese una opcion:");
                opcion= scanner.nextInt();//Ingreso de la opcion del usuario
                switch(opcion){//Menu
                    case 1:
                        for(int i=5;i<10;i++){//Ciclo para agregar los estudiantes faltantes
                            
                            System.out.println("Estudiante "+"[" +i+"]");
                        est[i]=new Estudiante(CapturaEntrada.capturarCadena("Introduce nombre"),
                                CapturaEntrada.capturarEntero("Introduce tu numero de control"),
                                CapturaEntrada.capturarCadena("Ingresa el nombre de la materia"),
                                CapturaEntrada.capturarDoble("Ingresa tu calificacion"));
                        }
                        System.out.println("Comprobacion de captura.");
                        for(int i = 0;i<10;i++) {//Impresion de todos los estudiantes
                       System.out.println("Estudiante "+"[" +i+"]"+"\n"+
                                "Nombre: " + est[i].getNombre()+"\n"+
                                "Numero de control: " + est[i].getNumControl()+"\n"+
                                "Materia: "+ est[i].getMateria()+"\n"+
                                "Calificacion: " + est[i].getCalificacion()+"\n"+
                                "Estado de la materia: " + est[i].AsignarEstado());
                        }
                        break;
                    case 2:
                        if(est[5]==null)//Se comprueba si el estudiante numero 6 tiene datos o no
                        {
                            for(int i = 0;i<5;i++) {//Ciclo para imprimir los primeros 5 estudiantes
                            System.out.println("Estudiante "+"[" +i+"]"+"\n"+
                                "Nombre: " + est[i].getNombre()+"\n"+
                                "Numero de control: " + est[i].getNumControl()+"\n"+
                                "Materia: "+ est[i].getMateria()+"\n"+
                                "Calificacion: " + est[i].getCalificacion()+"\n"+
                                "Estado de la materia: " + est[i].estado);
                        }
                        }
                        else
                        {
                          for(int i = 0;i<10;i++) {//Ciclo de impresion para los datos de los estudiantes
                                System.out.println("Estudiante " + i+"\n"+
                                "Nombre: " + est[i].getNombre()+"\n"+
                                "Numero de control: " + est[i].getNumControl()+"\n"+
                                "Materia: "+ est[i].getMateria()+"\n"+
                                "Calificacion: " + est[i].getCalificacion()+"\n"+
                                "Estado de la materia: " + est[i].AsignarEstado());
                        }  
                        }
                        
                        break;
                    case 3:
                        if(est[5]==null)//Se comprueba si el estudiante numero 6 tiene datos o no
                        {
                            for(int i = 0;i<5;i++)//Ciclo para cambiar las calificaciones de todos los estudiantes
                            {
                                System.out.println("Estudiante "+"[" +i+"]");
                                 est[i].setCalificacion(CapturaEntrada.capturarFlotante("Nueva calificacion para " + est[i].getNombre()));
                            }
                        }
                        else
                        {
                            for(int i = 0;i<10;i++)//Ciclo para cambiar las calificaciones de todos los estudiantes
                            {
                                System.out.println("Estudiante "+"[" +i+"]");
                                 est[i].setCalificacion(CapturaEntrada.capturarFlotante("Nueva calificacion para " + est[i].getNombre()));
                            }
                            System.out.println("Cambio de calificacion:");
                            for(int i = 0;i<10;i++) {//Impresion de los datos comprobamos que se hizo el cambio
                                    System.out.println("Estudiante "+"[" +i+"]"+"\n"+
                                    "Nombre: " + est[i].getNombre()+"\n"+
                                    "Numero de control: " + est[i].getNumControl()+"\n"+
                                    "Materia: "+ est[i].getMateria()+"\n"+
                                    "Calificacion: " + est[i].getCalificacion()+"\n"+
                                    "Estado de la materia: " + est[i].AsignarEstado());//Se llama al metodo para poner el estado 
                            }  
                        }
                        break;
                         
                  
                   case 4:
                       //Impresion de la salida del usuario
                       System.out.println("Gracias por usar el programa.");
                        break;
                    default:
                        //En caso de que ingrese una opcion incorrecta mostrara el mensaje
                        System.out.println("Ingreso una opcion invalida.");
                
                }
            }catch(Exception e){
                System.out.println("Error!");
            }
        }while(opcion>=1 && opcion<=3);
    }
    
}


