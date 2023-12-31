package com.booking.booking.models.serializable;

import com.booking.booking.parse.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerializableHotel {
    private String id;
    private String name;
    private String type;
    private String city;
    private String address;
    private String distance;
    private ArrayList<String> photos;
    private String title;
    private int rating;
    private ArrayList<Room> rooms;
    private double cheapestPrice;
    private boolean featured;
}
