package uz.task.constant;

public enum CorrespondentEnum {
    CB(1),
    GNI(2),
    TSJ(3);

    private final Integer correspondent;

    CorrespondentEnum(Integer value) {
        this.correspondent = value;
    }

    public Integer getCorrespondent() {
        return correspondent;
    }
}
