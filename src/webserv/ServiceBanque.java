package webserv;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Compte;

public class ServiceBanque {
	public double convert(double montant) {
		return montant*11;
	}
	public Compte getCompte(int code) {
		return new Compte(code,Math.random()*9000,new Date());
	}
	public List<Compte> listCompte(){
		List<Compte> comptes=new ArrayList<Compte>();
		comptes.add(new Compte(1,Math.random()*9000,new Date()));
		comptes.add(new Compte(2,Math.random()*9000,new Date()));
		comptes.add(new Compte(3,Math.random()*9000,new Date()));
		return comptes;
	}
}
