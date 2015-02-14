package DeDA.TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import DeDA.PROJ.Utils.Dadi;
import DeDA.PROJ.Utils.InvalidFormulaException;

public class DadiTEST {

	@Test
	public void testFormulaDadi() {
		int l = 0;
		try {
			for (int c = 0; c < 1000; c++) {
				l = Dadi.formulaDadi("1d6");
				assertTrue("l:"+l,(l >= 1) && (l <= 6));
			}
			for (int c = 0; c < 1000; c++) {
				l = Dadi.formulaDadi("1d6+1d20");
				assertTrue("l:"+l,(l >= 2) && (l <= 26));
			}
			for (int c = 0; c < 1000; c++) {
				l = Dadi.formulaDadi("6d6");
				assertTrue("l:"+l,(l >= 6) && (l <= 36));
			}
			for (int c = 0; c < 1000; c++) {
				l = Dadi.formulaDadi("3d6+3d8+1d3+5d20");
				assertTrue("l:"+l,(l >= 12) && (l <= 145));
			}
			for (int c = 0; c < 1000; c++) {
				l = Dadi.formulaDadi("1d2");
				assertTrue("l:"+l,(l >= 1) && (l <= 2));
			}
		} catch (InvalidFormulaException e) {
			e.printStackTrace();
			fail("Exception");
		}
	}

	@Test
	public void testLancia1dx() {
		int l = Dadi.lancia1dx(0);
		assertTrue(l == 0);
		l = Dadi.lancia1dx(1);
		assertTrue(l == 1);
		for (int i = 2; i < 100; i++) {
			for (int c = 0; c < 1000; c++) {
				l = Dadi.lancia1dx(i);
				assertTrue((l >= 1) && (l <= i));
			}
		}
	}

}
