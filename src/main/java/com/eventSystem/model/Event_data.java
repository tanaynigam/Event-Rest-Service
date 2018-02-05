package com.eventSystem.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.time.Instant;

@Entity // This tells Hibernate to make a table out of this class
public class Event_data {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private String Organizer_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Instant start_time;
    private String start_timezone;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Instant end_time;
    private String end_timezone;
    private String Currency;
    private String venue_id;
    private boolean online_event;
    private boolean listed;
    private String logo_id;
    private String category_id;
    private String subcategory_id;
    private String format_id;
    private boolean shareable;
    private boolean invite_only;
    private String password;
    private Integer capacity;
    private boolean show_remaining;
    private boolean reserved_seating;
    private String source;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrganizer_id() {
        return Organizer_id;
    }

    public void setOrganizer_id(String organizer_id) {
        Organizer_id = organizer_id;
    }

    public Instant getStart_time() {
        return start_time;
    }

    public void setStart_time(Instant start_time) {
        this.start_time = start_time;
    }

    public String getStart_timezone() {
        return start_timezone;
    }

    public void setStart_timezone(String start_timezone) {
        this.start_timezone = start_timezone;
    }

    public Instant getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Instant end_time) {
        this.end_time = end_time;
    }

    public String getEnd_timezone() {
        return end_timezone;
    }

    public void setEnd_timezone(String end_timezone) {
        this.end_timezone = end_timezone;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getVenue_id() {
        return venue_id;
    }

    public void setVenue_id(String venue_id) {
        this.venue_id = venue_id;
    }

    public boolean isOnline_event() {
        return online_event;
    }

    public void setOnline_event(boolean online_event) {
        this.online_event = online_event;
    }

    public boolean isListed() {
        return listed;
    }

    public void setListed(boolean listed) {
        this.listed = listed;
    }

    public String getLogo_id() {
        return logo_id;
    }

    public void setLogo_id(String logo_id) {
        this.logo_id = logo_id;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getSubcategory_id() {
        return subcategory_id;
    }

    public void setSubcategory_id(String subcategory_id) {
        this.subcategory_id = subcategory_id;
    }

    public String getFormat_id() {
        return format_id;
    }

    public void setFormat_id(String format_id) {
        this.format_id = format_id;
    }

    public boolean isShareable() {
        return shareable;
    }

    public void setShareable(boolean shareable) {
        this.shareable = shareable;
    }

    public boolean isInvite_only() {
        return invite_only;
    }

    public void setInvite_only(boolean invite_only) {
        this.invite_only = invite_only;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isShow_remaining() {
        return show_remaining;
    }

    public void setShow_remaining(boolean show_remaining) {
        this.show_remaining = show_remaining;
    }

    public boolean isReserved_seating() {
        return reserved_seating;
    }

    public void setReserved_seating(boolean reserved_seating) {
        this.reserved_seating = reserved_seating;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


}