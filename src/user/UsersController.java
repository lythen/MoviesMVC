package user;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import user.UsersCommand;
public class UsersController {
	@RequestMapping("/sigup.do")
	public ModelAndView sigup(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		UsersCommand cmd = new UsersCommand();
		cmd.setUserName(req.getServletContext().getInitParameter("username"));
		cmd.setPassWord(req.getServletContext().getInitParameter("password"));
		mv.addObject("username",cmd.getUserName());
		mv.addObject("password",cmd.getPassWord());
		mv.setViewName("index");
		return mv;
	}
	
}
