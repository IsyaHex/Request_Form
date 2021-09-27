package uz.task.dto;


import org.springframework.web.multipart.MultipartFile;

public class RequestSaveDto {

    private Long id;
    private String registrationNumber;
    private String sourceFileId;
    private String sourceDate;
    private Integer deliveryForm;
    private Integer correspondent;
    private String topic;
    private String description;
    private String dueDate;
    private Integer access;
    private Integer inspection;
    private MultipartFile filePath;

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

    public String getSourceFileId() {
        return sourceFileId;
    }

    public void setSourceFileId(String sourceFileId) {
        this.sourceFileId = sourceFileId;
    }

    public String getSourceDate() {
        return sourceDate;
    }

    public void setSourceDate(String sourceDate) {
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

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
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

    public MultipartFile  getFilePath() {
        return filePath;
    }

    public void setFilePath(MultipartFile  filePath) {
        this.filePath = filePath;
    }
}
