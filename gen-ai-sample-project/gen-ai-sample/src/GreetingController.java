import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, ";
	private final int counter = 0;

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter++, template + name);
	}

    /*
    A method that detects whether a given number is negative or not
    */
    private static boolean isNegative(int x, String methodname)
    {
    try {
        if(x<0)
        throw new IllegalArgumentException("Error: Non-negative integer used in method " + methodname);
        return false;
    }
    catch (IllegalArgumentException e)
    {
        System.out.println(e);
        return true;
    }
    }
}