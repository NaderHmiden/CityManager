/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

/**
 *
 * @author manso
 */
import model.*;
import java.util.*;
import java.util.stream.Collectors;

public class ServiceController {

    private final List<Service> services = new ArrayList<>();

    public void addService(Service s) {
        services.add(s);
    }

    public List<Service> listServices() {
        return new ArrayList<>(services);
    }

    public List<Service> filterByType(String type) {
        return services.stream()
                .filter(s -> s.type().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }
}
