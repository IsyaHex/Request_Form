package uz.task.domain;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "request_seq")
    @SequenceGenerator(name = "request_seq", sequenceName = "seq_request", allocationSize = 1)
    private Long id;

    @Column(name = "registration_number")
    private String registrationNumber;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(name = "registration_date")
    private Date registrationDate;

    @Column(name = "source_file_id")
    private String sourceFileId;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(name = "source_file_date")
    private Date sourceDate;

    @Column(name = "delivery_form")
    private Integer deliveryForm;

    @Column(name = "correspondent")
    private Integer correspondent;

    @Column(name = "topic")
    private String topic;

    @Column(name = "description")
    private String description;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "access")
    private Integer access;

    @Column(name = "inspection")
    private Integer inspection;

    @Column(name = "file_path")
    private String filePath;
//    private MultipartFile filePath;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getSourceFileId() {
        return sourceFileId;
    }

    public void setSourceFileId(String sourceFileId) {
        this.sourceFileId = sourceFileId;
    }

    public Date getSourceDate() {
        return sourceDate;
    }

    public void setSourceDate(Date sourceDate) {
        this.sourceDate = sourceDate;
    }

    public Integer getDeliveryForm() {
        return deliveryForm;
    }

    public void setDeliveryForm(Integer deliveryForm) {
        this.deliveryForm = deliveryForm;
    }

    public Integer getCorrespondent() {
        return correspondent;
    }

    public void setCorrespondent(Integer correspondent) {
        this.correspondent = correspondent;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    public Integer getInspection() {
        return inspection;
    }

    public void setInspection(Integer inspection) {
        this.inspection = inspection;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Request)) return false;
        Request form = (Request) o;
        return getId().equals(form.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
