package egovframework.example.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.example.main.vo.StudentVo;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET) 
	public String loginForm(Model model) throws Exception { 
		model.addAttribute("studentVO", new StudentVo()); 
		return "login/login"; 
	}

}
