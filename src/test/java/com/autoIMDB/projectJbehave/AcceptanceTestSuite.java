package com.autoIMDB.projectJbehave;

//package com.imdb.jbehave;

import net.thucydides.jbehave.ThucydidesJUnitStories;

public class AcceptanceTestSuite extends ThucydidesJUnitStories {
	

}


/*import org.jbehave.core.configuration.Configuration;

import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import static org.jbehave.core.reporters.Format.CONSOLE;  
import static org.jbehave.core.reporters.Format.TXT;

public abstract class TestRunner extends JUnitStories {


	 @Override  
	   public Configuration configuration() {  
	     return super.configuration()  
	         .useStoryReporterBuilder(  
	             new StoryReporterBuilder()  
	                 .withDefaultFormats()  
	                 .withFormats(CONSOLE, TXT));  
	   }  

	   // Here we specify the steps classes  
	   @Override  
	   public InjectableStepsFactory stepsFactory() {  
	     return new InstanceStepsFactory(configuration(), new TestEngine());  
	   }  
}
*/