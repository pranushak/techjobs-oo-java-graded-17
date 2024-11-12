package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode(){
        return Objects.hash(getId());
    }

    @Override
    public String toString(){
        String nameValue = this.name != null ? this.name : "Data not available";
        String employerValue = (this.employer != null && this.getEmployer().getValue() != "") ? this.getEmployer().getValue() : "Data not available";
        String locationValue = (this.location != null && this.getLocation().getValue() != "") ? this.getLocation().getValue() : "Data not available";
        String positionTypeValue = (this.positionType != null && this.getPositionType().getValue() != "") ? this.getPositionType().getValue() : "Data not available";
        String coreCompetencyValue = (this.coreCompetency != null && this.getCoreCompetency().getValue() != "") ? this.getCoreCompetency().getValue() : "Data not available";

        return System.lineSeparator() + "ID: "+ this.id + System.lineSeparator() +
                "Name: " + nameValue + System.lineSeparator() +
                "Employer: " + employerValue + System.lineSeparator() +
                "Location: " + locationValue + System.lineSeparator() +
                "Position Type: " + positionTypeValue + System.lineSeparator() +
                "Core Competency: " + coreCompetencyValue + System.lineSeparator();
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
