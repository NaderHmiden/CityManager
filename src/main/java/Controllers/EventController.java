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
import model.exception.CityException;
import java.util.*;
import java.util.stream.Collectors;

public class EventController {
    private final List<Event> events = new ArrayList<>();

    public void addEvent(Event e) { events.add(e); }
    public List<Event> listEvents() { return events; }
    public List<Event> upcomingEvents() {
        return events.stream().filter(e -> !e.date().isEmpty()).collect(Collectors.toList());
    }

    public void registerEvent(String name) throws CityException {
        Optional<Event> opt = events.stream()
            .filter(e -> e.name().equalsIgnoreCase(name))
            .findFirst();
        if(opt.isEmpty()) throw new CityException("Événement introuvable !");
        Event e = opt.get();
        if(e.maxParticipants() <= 0) throw new CityException("Plus de places disponibles !");
        events.remove(e);
        events.add(new Event(e.name(), e.location(), e.date(), e.maxParticipants()-1, e.type()));
    }
}
