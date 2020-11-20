package trabalho_psp0;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import org.junit.Test;

public class CompetidoresTest {
	
	Competidores c;
	
	@Test
	public void num_class_c1Test() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		c = new Competidores(3, 3, a);
		
		assertEquals(3, c.get_n_class());
	}
	
	@Test
	public void num_class_c2Test() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(3);
		a.add(4);
		
		c = new Competidores(3, 2, a);
		
		assertEquals(3, c.get_n_class());
	}
	
	@Test
	public void num_class_c3Test() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(3);
		
		c = new Competidores(3, 2, a);
		
		assertEquals(2, c.get_n_class());
	}
	
	@Test
	public void desvio_Test() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(3);
		a.add(4);
		
		c = new Competidores(4, 2, a);
		
		DecimalFormat df = new DecimalFormat("#.00");
		String dp = df.format(c.get_dp_comp());
		
		assertEquals("1,09", dp);
	}
	
	
	@Test
	public void media_Test() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(3);
		a.add(4);
			
		c = new Competidores(4, 1, a);
			
		DecimalFormat df = new DecimalFormat("#.00");
		String dp = df.format(c.get_media_comp());
			
		assertEquals("2,75", dp);
	}
	
}
