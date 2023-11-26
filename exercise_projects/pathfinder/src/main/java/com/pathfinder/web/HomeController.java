package com.pathfinder.web;

import com.pathfinder.model.Route;
import com.pathfinder.service.RouteService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private RouteService routeService;

    @Autowired
    public HomeController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/")
    @Transactional
    public String home(Model model){

        List<Route> routes = routeService.getMostCommented();
        model.addAttribute("mostCommented", routes.get(0));

        return "index";
    }
}
