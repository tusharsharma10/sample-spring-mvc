package learn.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method = RequestMethod.GET)
	
	public String showLoginPage(){
		return "login";
	}
	
@RequestMapping(value="/login", method = RequestMethod.POST)
	
	public String redirectToWelcomePage(@RequestParam String name,ModelMap map){
	// key of map should match with value in name attribute in jsp file	
	map.put("name", name);
		return "welcome";
	}
}
