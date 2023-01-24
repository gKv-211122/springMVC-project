package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetails(@PathVariable("userId") int userId
			, @PathVariable("userName") String userName) {
		
		System.out.println(userId);
		System.out.println(userName);
		return "home";
	}
	
	@RequestMapping("/home")
	public String home() {
		
		System.out.println("going to home view...");
		String str = null;
		System.out.println(str.length());
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		String url = "https://www.google.com/search?q="+query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
	
	
	/*
	 * // @ExceptionHandler({NullPointerException.class,
	 * NumberFormatException.class})
	 * 
	 * @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(value=NullPointerException.class) public String
	 * exceptionHandlerNull(Model m) { m.addAttribute("msg",
	 * "NullPointerException");
	 * 
	 * return "null_page"; }
	 * 
	 * @ExceptionHandler(value=NumberFormatException.class) public String
	 * exceptionHandleNumberFormat(Model m) { m.addAttribute("msg",
	 * "NumberFormatException");
	 * 
	 * return "null_page"; }
	 * 
	 * // handle all exception
	 * 
	 * @ExceptionHandler(value=Exception.class) public String
	 * exceptionHandleGeneric(Model m) { m.addAttribute("msg",
	 * "Exception has occured !!");
	 * 
	 * return "null_page"; }
	 */
}
