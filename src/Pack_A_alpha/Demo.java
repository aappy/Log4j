package Pack_A_alpha;
import org.apache.logging.log4j.*;
public class Demo {
	
    private static Logger log = LogManager.getLogger(Demo.class.getName());
    
	public static void main(String[] args) {
		
		log.debug("I am debugging");
		
		if(2>1) {
			log.info("obj not present");
			log.error("this is error");
			log.fatal("this is fatal");
			
		} 		
	}
}
