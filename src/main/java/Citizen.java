/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Classe scellée représentant un citoyen.
 * Seules Admin et Newcomer peuvent hériter.
 */
public sealed class Citizen permits Admin, Newcomer {
    protected final String name;
    protected final String email;
    protected final String arrivalDate;

    public Citizen(String name, String email, String arrivalDate) {
        this.name = name;
        this.email = email;
        this.arrivalDate = arrivalDate;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getArrivalDate() { return arrivalDate; }
}

