/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.exception;

/**
 *
 * @author manso
 */public class CityException extends Exception {

    /**
     * Constructeur avec message d'erreur.
     * @param message le message de l'exception
     */
    public CityException(String message) {
        super(message);
    }

    /**
     * Constructeur avec message et cause (pour chaînage des exceptions)
     * @param message le message de l'exception
     * @param cause l'exception d'origine
     */
    public CityException(String message, Throwable cause) {
        super(message, cause);
    }
}
