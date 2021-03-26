package webserv;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import metier.Compte;
@WebService(serviceName = "BanqueWS")
public class ServiceBanque {
	@WebMethod(operationName = "Conversion EurDH")
	public double convert(double montant) {
		return montant*11;
	}
	@WebMethod
	public Compte getCompte(int code) {
		return new Compte(code,Math.random()*9000,new Date());
	}
	@WebMethod
	public List<Compte> listCompte(){
		List<Compte> comptes=new ArrayList<Compte>();
		comptes.add(new Compte(1,Math.random()*9000,new Date()));
		comptes.add(new Compte(2,Math.random()*9000,new Date()));
		comptes.add(new Compte(3,Math.random()*9000,new Date()));
		return comptes;
	}
}
