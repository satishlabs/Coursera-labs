

import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyServletContextListener
 *
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
	
	ServletContext context;
	String name;
	String value;
	
    public MyServletContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	
    	context = sce.getServletContext();
    	String car_reg_no = context.getInitParameter("Reg_No");
    	String car_make = context.getInitParameter("Make");
    	
    	Car carObj = new Car(car_reg_no, car_make);
    	context.setAttribute("car", carObj);
    	context.log("Context has been initilized at: "+new Date());
    }
	
}
