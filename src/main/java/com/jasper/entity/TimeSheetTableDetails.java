package com.jasper.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.lang.String;

import java.time.LocalTime;

@Data
@NoArgsConstructor
public class TimeSheetTableDetails {
    private String name;
    private String role;
    private String month;
    private Integer date;
    private LocalTime timeMon;
    private LocalTime timeTue;
    private LocalTime timeWed;
    private LocalTime timeThu;
    private LocalTime timeFri;
    private LocalTime timeSat;
    private LocalTime timeSun;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public LocalTime getTimeMon() {
        return timeMon;
    }

    public void setTimeMon(LocalTime timeMon) {
        this.timeMon = timeMon;
    }

    public LocalTime getTimeTue() {
        return timeTue;
    }

    public void setTimeTue(LocalTime timeTue) {
        this.timeTue = timeTue;
    }

    public LocalTime getTimeWed() {
        return timeWed;
    }

    public void setTimeWed(LocalTime timeWed) {
        this.timeWed = timeWed;
    }

    public LocalTime getTimeThu() {
        return timeThu;
    }

    public void setTimeThu(LocalTime timeThu) {
        this.timeThu = timeThu;
    }

    public LocalTime getTimeFri() {
        return timeFri;
    }

    public void setTimeFri(LocalTime timeFri) {
        this.timeFri = timeFri;
    }

    public LocalTime getTimeSat() {
        return timeSat;
    }

    public void setTimeSat(LocalTime timeSat) {
        this.timeSat = timeSat;
    }

    public LocalTime getTimeSun() {
        return timeSun;
    }

    public void setTimeSun(LocalTime timeSun) {
        this.timeSun = timeSun;
    }



    public TimeSheetTableDetails(String name, String role, String month, Integer date, LocalTime timeMon, LocalTime timeTue, LocalTime timeWed, LocalTime timeThu, LocalTime timeFri, LocalTime timeSat, LocalTime timeSun) {
        this.name = name;
        this.role = role;
        this.month = month;
        this.date = date;
        this.timeMon = timeMon;
        this.timeTue = timeTue;
        this.timeWed = timeWed;
        this.timeThu = timeThu;
        this.timeFri = timeFri;
        this.timeSat = timeSat;
        this.timeSun = timeSun;
    }

}
