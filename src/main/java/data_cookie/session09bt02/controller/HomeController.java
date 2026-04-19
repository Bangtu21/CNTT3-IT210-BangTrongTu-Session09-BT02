package data_cookie.session09bt02.controller;

import data_cookie.session09bt02.model.Guest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String homePage(@CookieValue(value = "guest_name", defaultValue = "Khách lạ") String guestName, Model model) {
        Guest guest = new Guest(guestName);

        model.addAttribute("guest", guest);
        model.addAttribute("msg", "Chào mừng " + guest.getName() + " trở lại!");

        return "home-page";
    }
}
