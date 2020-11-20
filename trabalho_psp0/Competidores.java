package trabalho_psp0;

import java.util.ArrayList;
import java.util.Collections;

public class Competidores {
	private int n_comp;
	private int n_clas;
	private ArrayList<Integer> pont;
	private double dp_clas, dp_comp, m_class, m_comp;
	
	Competidores(int comp, int clas, ArrayList<Integer> p) {
		n_comp = p.size();
		n_clas = clas;
		
		pont = new ArrayList<Integer>(p);
		Collections.sort(pont, Collections.reverseOrder());
		novo_numero_classificados();
		
		set_m_comp();
		set_m_class();
		
		set_dp_class();
		set_dp_comp();
		
	}
	
	// Complexidade ciclomatica ==> 3
	void novo_numero_classificados() {
		for(int i=n_clas ; i<n_comp && n_clas>0 ; i++) {
			if(pont.get(i) == pont.get(i-1)) {
				n_clas++;
			} else {
				break;
			}
		}
	}
	
	// Complexidade ciclomatica ==> 2
	double calcula_desvio_padrao(int n, double media) {
		double soma = 0.0;
		
		for(int i=0 ; i<n ; i++) {
			double a = Math.pow(pont.get(i) - media, 2);
			soma += a;
		}
		
		return Math.sqrt(soma/n);
	}
	
	// Complexidade ciclomatica ==> 2
	double calcula_media(int n) {
		double soma = 0;
		
		for(int i=0 ; i<n ; i++) {
			soma += pont.get(i);
		}
		
		return soma/(n*1.0);
	}
	
	void set_dp_class() {
		dp_clas = calcula_desvio_padrao(n_clas, m_class);
	}
	
	void set_dp_comp() {
		dp_comp = calcula_desvio_padrao(n_comp, m_comp);
	}
	
	void set_m_class() {
		m_class = calcula_media(n_clas);
	}
	
	void set_m_comp() {
		m_comp = calcula_media(n_comp);
	}
	
	public void print_n_classificados() {
		System.out.println(n_clas);
	}
	
	void print(double x) {
		System.out.printf("%.2f\n", x);
	}
	
	public void print_dp_class() {
		print(dp_clas);
	}
	
	public void print_dp_comp() {
		print(dp_comp);
	}

	public void print_m_class() {
		print(m_class);
	}

	public void print_m_comp() {
		print(m_comp);
	}
	
	public double get_dp_comp() {
		return dp_comp;
	}
	
	public double get_media_comp() {
		return m_comp;
	}
	
	public int get_n_class() {
		return n_clas;
	}
}
