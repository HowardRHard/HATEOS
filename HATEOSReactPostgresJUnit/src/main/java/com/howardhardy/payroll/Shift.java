package com.howardhardy.payroll;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shift")
public class Shift implements Serializable {
 
    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long shiftid;
 
    @Column(name = "dow")
    private String dow;
 
    @Column(name = "tod")
    private String tod;
 
    protected Shift() {
    }
 
    public Shift(String dow, String tod) {
        this.dow = dow;
        this.tod = tod;
    }
 
    @Override
    public String toString() {
        return String.format("Shift[id=%d, Day of the week='%s', Time of day='%s']", shiftid, dow, tod);
    }
    
}