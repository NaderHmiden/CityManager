/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

/**
 *
 * @author manso
 */
import model.Notification;
import java.util.*;
import java.util.stream.Collectors;

public class NotificationController {

    private final List<Notification> notifications = new ArrayList<>();

    public void addNotification(Notification n) {
        notifications.add(n);
    }

    public List<Notification> listNotifications() {
        return new ArrayList<>(notifications);
    }

    public List<Notification> filterByRecipient(String email) {
        return notifications.stream()
                .filter(n -> n.recipientEmail().equalsIgnoreCase(email))
                .collect(Collectors.toList());
    }
}
