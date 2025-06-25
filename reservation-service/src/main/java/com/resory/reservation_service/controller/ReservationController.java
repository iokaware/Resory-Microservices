package com.resory.reservation_service.controller;

import com.resory.reservation_service.feignclient.RestaurantDto;
import com.resory.reservation_service.feignclient.RestaurantServiceClient;
import com.resory.reservation_service.model.Reservation;
import com.resory.reservation_service.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private RestaurantServiceClient restaurantServiceClient;

    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        reservation.setReservationId(java.util.UUID.randomUUID().toString().replace("-", "")); // Generate UUID
        reservation.setStatus("CONFIRMED");

        Optional<RestaurantDto> restaurantOptional = restaurantServiceClient.getRestaurantById(reservation.getRestaurantId());
        if (restaurantOptional.isPresent()) {
            reservation.setRestaurantName(restaurantOptional.get().getName());
        } else {
            throw new RuntimeException("Restaurant with ID " + reservation.getRestaurantId() + " not found.");
        }

        return reservationRepository.save(reservation);
    }

    @GetMapping("/user/{userId}")
    public List<Reservation> getReservationsByUserId(@PathVariable String userId) {
        return reservationRepository.findByUserId(userId);
    }

}