/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import stringcalculator.Punto1;
import stringcalculator.Punto2;
import stringcalculator.Punto3;
import stringcalculator.Punto4;
import stringcalculator.Punto5;
import stringcalculator.Punto6;

/**
 *
 * @author JuanDavid
 */
public class stringCalculatorTests {

    Punto1 punto1;
    Punto2 punto2;
    Punto3 punto3;
    Punto4 punto4;
    Punto5 punto5;
    Punto6 punto6;

    public stringCalculatorTests() {
        this.punto1 = new Punto1();
        this.punto2 = new Punto2();
        this.punto3 = new Punto3();
        this.punto4 = new Punto4();
        this.punto5 = new Punto5();
        this.punto6 = new Punto6();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void suma1() {
        int resultadoE = 3;
        int resultadoO = punto1.suma("2,1");
        assertEquals(resultadoO, resultadoE);
    }

    @Test
    public void suma2() {
// numeros a poner 1,2,3,4,5,6,7,8,9,10
        int resultadoE = 55;
        int resultadoO = punto2.suma2("1,2,3,4,5,6,7,8,9,10");
        assertEquals(resultadoO, resultadoE);
    }

    @Test
    public void suma3() {
// numeros a poner 1,2,{ ,3,4
        int resultadoE = 10;
        int resultadoO = punto3.suma3("1,2,},3,4");
        assertEquals(resultadoO, resultadoE);
    }

    @Test
    public void suma4() {
// numeros a poner 1\n2,3
        int resultadoE = 6;
        int resultadoO = punto4.suma4("1\\n2,3");
        assertEquals(resultadoO, resultadoE);
    }

    @Test
    public void suma5() {
        int resultadoE = 3;
        int resultadoO = punto5.suma5("1q1sdf1");
        assertEquals(resultadoO, resultadoE);
    }
    
     @Test
    public void suma6() {
        int resultadoE = 3;
        int resultadoO = punto6.suma6("1;2","//;\\n");
        assertEquals(resultadoO, resultadoE);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
