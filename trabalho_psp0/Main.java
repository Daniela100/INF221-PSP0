package trabalho_psp0;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	Competidores c;
	
	public void get_dados() {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
		ArrayList<Integer> pont = new ArrayList<Integer>();
		
		for(int i=0 ; i<n ; i++) {
			int a = input.nextInt();
			pont.add(a);
		}
		
		c = new Competidores(n, k, pont);
		
		input.close();
	}
	
	public void mostre_resultados() {
		c.print_n_classificados();
		c.print_dp_class();
		c.print_m_class();
		c.print_dp_comp();
		c.print_m_comp();
	}
	
	public static void main(String []args) {
		
		Main m = new Main();
		
		m.get_dados();
		
		m.mostre_resultados();
		double n = 0.00000000;
		
		DecimalFormat df = new DecimalFormat("#.00");
		String dp = df.format(n);
		
		System.out.println(dp);
		
	}
}
