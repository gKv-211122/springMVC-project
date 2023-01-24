package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandler {
	
		// @ExceptionHandler({NullPointerException.class, NumberFormatException.class})
	
		@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
		@org.springframework.web.bind.
			annotation.ExceptionHandler(value=NullPointerException.class)
		public String exceptionHandlerNull(Model m) {
			m.addAttribute("msg", "NullPointerException");
			
			return "null_page";
		}
		
		@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
		@org.springframework.web.bind.
			annotation.ExceptionHandler(value=NumberFormatException.class)
		public String exceptionHandleNumberFormat(Model m) {
			m.addAttribute("msg", "NumberFormatException");
			
			return "null_page";
		}
		
		// handle all exception
		@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
		@org.springframework.web.bind.
			annotation.ExceptionHandler(value=Exception.class)
		public String exceptionHandleGeneric(Model m) {
			m.addAttribute("msg", "Exception has occured !!");
			
			return "null_page";
		}
}
