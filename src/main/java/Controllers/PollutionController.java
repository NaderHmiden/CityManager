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

public class PollutionController {

    private final List<Pollution> pollutions = new ArrayList<>();

    public void addPollution(Pollution p) {
        pollutions.add(p);
    }

    public List<Pollution> listPollution() {
        return new ArrayList<>(pollutions);
    }

    public List<Pollution> highPollution(double threshold) {
        return pollutions.stream()
                .filter(p -> p.level() > threshold)
                .collect(Collectors.toList());
    }
}
