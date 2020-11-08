package com.example.travelAgency.model;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tripId;
    private Long userId;
    private String tripName;
    private String tripPrice;
    private Date tripDate;

    public Trip() {

    }

    public Trip(Long tripId, Long userId, String tripName, String tripPrice, Date tripDate) {
        this.tripId = tripId;
        this.userId = userId;
        this.tripName = tripName;
        this.tripPrice = tripPrice;
        this.tripDate = tripDate;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(String tripPrice) {
        this.tripPrice = tripPrice;
    }

    public Date getTripDate() {
        return tripDate;
    }

    public void setTripDate(Date tripDate) {
        this.tripDate = tripDate;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "tripId=" + tripId +
                ", userId=" + userId +
                ", tripName='" + tripName + '\'' +
                ", tripPrice='" + tripPrice + '\'' +
                ", tripDate=" + tripDate +
                '}';
    }
}



