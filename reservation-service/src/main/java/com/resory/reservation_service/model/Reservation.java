package com.resory.reservation_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String reservationId;
    private String userId;
    private String restaurantId;
    private int partySize;
    private LocalDateTime dateTime;
    private String notes;
    private String status;
    private String restaurantName;


    public Reservation() {
    }

    public Reservation(String reservationId, String userId, String restaurantId, int partySize, LocalDateTime dateTime, String notes, String status, String restaurantName) {
        this.reservationId = reservationId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.partySize = partySize;
        this.dateTime = dateTime;
        this.notes = notes;
        this.status = status;
        this.restaurantName = restaurantName;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getUserId() {
        return userId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public int getPartySize() {
        return partySize;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getNotes() {
        return notes;
    }

    public String getStatus() {
        return status;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

}