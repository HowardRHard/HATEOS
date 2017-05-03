package com.howardhardy.payroll;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Unsure as to how to implement the many to many relationship
//so instead I have created the model of what it would look
//like but not included the code that actually links up the tables

@Entity
@Table(name = "shiftemployeemap")
public class ShiftEmployeeMap implements Serializable {
 
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long swmid;
 
    @Column(name = "shiftid")
    private String shiftid;
 
    @Column(name = "workerid")
    private String workerid;
 
    protected ShiftEmployeeMap() {
    }
 
    public ShiftEmployeeMap(String shiftid, String workerid) {
        this.shiftid = shiftid;
        this.workerid = workerid;
    }
 
    @Override
    public String toString() {
        return String.format("swmid[id=%d, shiftid='%s', workerid='%s']", swmid, shiftid, workerid);
    }
    
}