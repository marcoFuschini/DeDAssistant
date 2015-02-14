package DeDA.TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import DeDA.PROJ.Caratteristiche;

public class CaratteristicheTEST {

	@Test
	public void testPunteggio2Modificatore() {
		int c=-4;
		for(int i=2;i<26;i+=2){
			assertEquals("P:"+i+" M:"+c,c, Caratteristiche.Punteggio2Modificatore(i));
			assertEquals("P:"+(i+1)+" M:"+c,c, Caratteristiche.Punteggio2Modificatore(i+1));
			c++;
		}
	}

}
