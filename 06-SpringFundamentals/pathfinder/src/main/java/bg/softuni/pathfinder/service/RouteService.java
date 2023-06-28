package bg.softuni.pathfinder.service;

import bg.softuni.pathfinder.model.Route;
import bg.softuni.pathfinder.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {
    private RouteRepository routeReporsitory;

    @Autowired
    public RouteService(RouteRepository routeReporsitory) {
        this.routeReporsitory = routeReporsitory;
    }

    public List<Route> getMostCommented() {
        return routeReporsitory.findMostCommented();
    }
}
