package com.gmrit.food4all.modals;

import java.io.Serializable;

public class Report implements Serializable {

    String email;
    String report;

    public Report() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
