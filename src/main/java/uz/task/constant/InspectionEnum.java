package uz.task.constant;

public enum InspectionEnum {
    NO(1),
    YES(2);

    private final Integer inspection;

    InspectionEnum(Integer value) {
        this.inspection = value;
    }

    public Integer getInspection() {
        return inspection;
    }
}
