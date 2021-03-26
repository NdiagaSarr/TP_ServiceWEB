import javax.xml.ws.Endpoint;

import webserv.ServiceBanque;

public class ServeurJaxWS {

	public static void main(String[] args) {
		String url="http://0.0.0.0:8585/";
		Endpoint.publish(url, new ServiceBanque());
		System.out.println("web service déployé sur: "+url);
	}
}