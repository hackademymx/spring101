package lat.futuredevelopers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import lat.futuredevelopers.beans.IPayService;
//http://websystique.com/spring/spring-beans-auto-wiring-example-using-xml-configuration/
public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		IPayService bean = (IPayService) context.getBean("payServiceBean");
	    bean.performPayment();
	    context.close();
	}

}
