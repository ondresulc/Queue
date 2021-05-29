package com.company;

import java.time.LocalDate;

public class Visit {
    String name;
    LocalDate dateOfVisit;
    String troubleDescription;
    TypeOfRequest type;

    public Visit(String name, LocalDate dateOfVisit, String troubleDescription, TypeOfRequest type) {
        this.name = name;
        this.dateOfVisit = LocalDate.now().plusDays(14);
        this.troubleDescription = troubleDescription;
        this.type = type;
    }

    public Visit visitingDoctor() {

        return new Visit(name, dateOfVisit, troubleDescription, type);
    }

    public LocalDate getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(LocalDate dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getTroubleDescription() {
        return troubleDescription;
    }

    public void setTroubleDescription(String troubleDescription) {
        this.troubleDescription = troubleDescription;
    }

    public TypeOfRequest getType() {
        return type;
    }

    public void setType(TypeOfRequest type) {
        this.type = type;
    }
}
