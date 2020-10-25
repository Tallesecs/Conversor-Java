package javancado.conversor.dao;

import org.springframework.stereotype.Repository;

import javancado.conversor.model.MoedaConversor;

@Repository
public class MoedaDAO {
	
		public double conversor(MoedaConversor moeda) {
	   double value =  moeda.getDolar() * moeda.getReal();
	   
	   return value;
	}
}
