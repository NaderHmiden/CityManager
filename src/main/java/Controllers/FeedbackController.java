/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

/**
 *
 * @author manso
 */
import model.Feedback;
import java.util.*;
import java.util.stream.Collectors;

public class FeedbackController {

    private final List<Feedback> feedbacks = new ArrayList<>();

    public void addFeedback(Feedback f) {
        feedbacks.add(f);
    }

    public List<Feedback> listFeedbacks() {
        return new ArrayList<>(feedbacks);
    }

    public List<Feedback> filterByCitizen(String email) {
        return feedbacks.stream()
                .filter(f -> f.citizenEmail().equalsIgnoreCase(email))
                .collect(Collectors.toList());
    }

    public double averageRating(String subject) {
        return feedbacks.stream()
                .filter(f -> f.subject().equalsIgnoreCase(subject))
                .mapToInt(Feedback::rating)
                .average()
                .orElse(0);
    }
}
