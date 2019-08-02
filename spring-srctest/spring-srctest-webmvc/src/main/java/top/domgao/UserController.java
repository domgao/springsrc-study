package top.domgao;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.domgao.bean.User;

@Controller
public class UserController {

	@ResponseBody
	@RequestMapping(value = "/getUser")
	public ModelAndView getUser() {
		User user = new User();
		return new ModelAndView("index","user",user);
	}
}
