/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author test
 */

import javax.persistence.*;

@Entity
@Table(name="auth")
public class auth {
    
    @Id
    @Column(name="userId")
    String userid;

    
    @Column(name="schema")
    String schema;
    @Column(name="timeTaken")

    double timeTaken;
    @Column(name="state")

    String state;
    @Column(name="tc1")

    double tc1;
    @Column(name="st1")

    String st1;    
    @Column(name="tc2")

    double tc2;
    @Column(name="st2")

    String st2;
    @Column(name="tc3")

    double tc3;
    @Column(name="s3")

    String s3; 
    @Column(name="tc4")

    double tc4;
    @Column(name="s4")

    String s4;
    @Column(name="tc5")

    double tc5;
    @Column(name="s5")

    String s5;

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public void setTimeTaken(double timeTaken) {
        this.timeTaken = timeTaken;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setTc1(double tc1) {
        this.tc1 = tc1;
    }

    public void setSt1(String st1) {
        this.st1 = st1;
    }

    public void setTc2(double tc2) {
        this.tc2 = tc2;
    }

    public void setSt2(String st2) {
        this.st2 = st2;
    }

    public void setTc3(double tc3) {
        this.tc3 = tc3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }

    public void setTc4(double tc4) {
        this.tc4 = tc4;
    }

    public void setS4(String s4) {
        this.s4 = s4;
    }

    public void setTc5(double tc5) {
        this.tc5 = tc5;
    }

    public void setS5(String s5) {
        this.s5 = s5;
    }

    public String getUserid() {
        return userid;
    }

    public String getSchema() {
        return schema;
    }

    public double getTimeTaken() {
        return timeTaken;
    }

    public String getState() {
        return state;
    }

    public double getTc1() {
        return tc1;
    }

    public String getSt1() {
        return st1;
    }

    public double getTc2() {
        return tc2;
    }

    public String getSt2() {
        return st2;
    }

    public double getTc3() {
        return tc3;
    }

    public String getS3() {
        return s3;
    }

    public double getTc4() {
        return tc4;
    }

    public String getS4() {
        return s4;
    }

    public double getTc5() {
        return tc5;
    }

    public String getS5() {
        return s5;
    }
    

    public auth() {
        
    }
    
    
}
