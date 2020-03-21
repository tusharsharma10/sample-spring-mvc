package learn.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello(){
		return "Hello World!!";
	}
}
