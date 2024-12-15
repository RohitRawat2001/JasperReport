package com.jasper.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class TimeSheetDetails {
    private String companyName;
    private Integer year;
    private Integer week;
    private Integer totalhours;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getTotalhours() {
        return totalhours;
    }

    public void setTotalhours(Integer totalhours) {
        this.totalhours = totalhours;
    }



    public TimeSheetDetails(String companyName, Integer year, Integer week, Integer totalhours) {
        this.companyName = companyName;
        this.year = year;
        this.week = week;
        this.totalhours = totalhours;
    }
}
