package com.mc.informationsystem;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "alerts")
public class Alert {
    @Id
    private String Id;
    public Integer Severity;
    public Date Occurance;
    public String Description;
    public String RelatedSystem;
    public AlertStatus Status;
    
    public void Alert(Integer severity, Date occurance, String description, String relatedSystem) {
        this.Severity = severity;
        this.Occurance = occurance;
        this.Description = description;
        this.RelatedSystem = relatedSystem;
        this.Status = AlertStatus.OPEN;
    }
    
    public String getId() {
        return this.Id;
    }
    
    public void setStatus(AlertStatus status) {
        this.Status = status;
    }
}