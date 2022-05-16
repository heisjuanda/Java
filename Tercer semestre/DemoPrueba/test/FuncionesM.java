/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import demoprueba.FuncionesMatematicas;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanDavid
 */
public class FuncionesM {
    FuncionesMatematicas f;
    
    public FuncionesM() {
        f =  new FuncionesMatematicas();
    }
    
    @BeforeClass//invocado al principio de las pruebas
    public static void setUpClass() {
        System.out.println("empieza la validación");
    }
    
    @AfterClass//cuando se acaban las validaciones
    public static void tearDownClass() {
        System.out.println("termino la validación");
    }
    
    @Before//antes de cada prueba
    public void setUp() {
        System.out.println("iniciando prueba");
    }
    
    @After//despues de cada prueba
    public void tearDown() {
        System.out.println("preueba exitosa");
    }

    @Test
    public void sumarPositivos(){
        int a=6;
        int b=9;

        int resultadEsperado = 15;
        int resultadoObtenido = f.sumar(a, b);
        assertEquals(resultadEsperado, resultadoObtenido);
    }
    
    @Test
    public void sumarNegativos(){
        int a=-2;
        int b=-1;
        
        int resultadEsperado = -3;
        int resultadoObtenido = f.sumar(a, b);
        assertEquals(resultadEsperado, resultadoObtenido);
    }
    
    @Test
    public void buscarMaximo(){
        int lista[] = {41,2,4,5};
        int resultadoEsperado = 41;
        int resultadoObtenido = f.buscarMax(lista);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void buscarMaximo1(){
        int lista[] = {4,22,4,5};
        int resultadoEsperado = 22;
        int resultadoObtenido = f.buscarMax(lista);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void niño(){
        int edad = 5;
        String resultadoEsperado = "niño";
        String resultadoObtenido = f.edadPerson(edad);
        assertEquals(resultadoObtenido, resultadoEsperado);
    }
    
    @Test
    public void adolescente(){
        int edad = 16;
        String resultadoEsperado = "adolescente";
        String resultadoObtenido = f.edadPerson(edad);
        assertEquals(resultadoObtenido, resultadoEsperado);
    }
     
    @Test
    public void joven(){
        int edad = 21;
        String resultadoEsperado = "joven";
        String resultadoObtenido = f.edadPerson(edad);
        assertEquals(resultadoObtenido, resultadoEsperado);
    }
    
     @Test
    public void inversoPalabra(){
        String a = "casa";
        String resultadoEsperado = "asac";
        String resultadoObtenido = f.inversoPalabra(a);
        assertEquals(resultadoObtenido, resultadoEsperado);
    }
    
    @Test
    public void inversoPalabra1(){
        String a = "hola pa";
        String resultadoEsperado = "aloh ap";
        String resultadoObtenido = f.inversoPalabra(a);
        assertEquals(resultadoObtenido, resultadoEsperado);
    }
    
    
    @Test
    public void longitudContra(){
        String contraseña ="abc123";
        boolean resultadoEsperado = true;
        boolean resultadoObtenido = f.validadContraseña(contraseña);
        assertEquals(resultadoObtenido, resultadoEsperado);
    }
    
    @Test
    public void longitudContraMaluca(){
        String contraseña ="abc123sasadf";
        boolean resultadoEsperado = false;
        boolean resultadoObtenido = f.validadContraseña(contraseña);
        assertEquals(resultadoObtenido, resultadoEsperado);
    }
    
    @Test
    public void tieneNumero(){
        String contraseña ="abc123";
        boolean resultadoEsperado = true;
        boolean resultadoObtenido = f.validadContraseña(contraseña);
        assertEquals(resultadoObtenido, resultadoEsperado);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
