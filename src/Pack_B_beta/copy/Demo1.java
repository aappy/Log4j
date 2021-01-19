package Pack_B_beta.copy;
import org.apache.logging.log4j.*;
public class Demo1 {
	
    private static Logger log = LogManager.getLogger(Demo1.class.getName());
    
	public static void main(String[] args) {
		
		log.debug("I am debugging");
		
		if(2>1) {
			log.info("obj not present");
			log.error("this is error");
			log.fatal("this is fatal");
			
		} 		
	}
}
