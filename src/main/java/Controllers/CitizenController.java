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

public class CitizenController {
    private final List<Citizen> citizens = new ArrayList<>();

    public void addCitizen(Citizen c) { citizens.add(c); }

    public List<Citizen> listCitizens() { return citizens; }

    public List<Object> newcomersThisMonth(String month) {
        return citizens.stream()
                .filter(c -> c instanceof Newcomer)
                .map(c -> (Newcomer)c)
                .filter(n -> n.getArrivalDate().startsWith(month))
                .collect(Collectors.toList());
    }

    public CitizenStats generateStats(String month) {
        int total = citizens.size();
        int newcomers = newcomersThisMonth(month).size();
        return new CitizenStats(total, newcomers);
    }
}
