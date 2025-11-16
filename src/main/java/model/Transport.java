/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author manso
 */
public class Transport {
    private final String type;
    private final String name;
    private final String location;

    public Transport(String name, String type, String location) {
        this.name = name;
        this.type = type;
        this.location = location;
    }

    public String type() { return type; }
    public String name() { return name; }
    public String location() { return location; }
}
