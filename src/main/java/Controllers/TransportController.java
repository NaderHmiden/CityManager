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

public class TransportController {

    private final List<Transport> transports = new ArrayList<>();

    public void addTransport(Transport t) {
        transports.add(t);
    }

    public List<Transport> listTransports() {
        return new ArrayList<>(transports);
    }

    public List<Transport> filterByType(String type) {
        return transports.stream()
                .filter(t -> t.type().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }
}