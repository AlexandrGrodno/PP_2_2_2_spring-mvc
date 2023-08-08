package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @GetMapping(value = "/users")
    public String getUser(@RequestParam(value = "count", defaultValue="5") int count, ModelMap model){

//

        model.addAttribute("messages","carDAO.getCarList(count)");
        return "/users";

    }
}
