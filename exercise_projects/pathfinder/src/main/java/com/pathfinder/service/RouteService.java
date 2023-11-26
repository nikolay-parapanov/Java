package com.pathfinder.service;

import com.pathfinder.model.Route;
import com.pathfinder.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RouteService {
    private RouteRepository routeRepository;

    @Autowired
    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public List<Route> getMostCommented() {
        return routeRepository.findMostCommented();
    }
}