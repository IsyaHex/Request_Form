package uz.task.constant;

public enum AccessEnum {
    NO(1),
    YES(2);

    private final Integer access;

    AccessEnum(Integer value) {
        this.access = value;
    }

    public Integer getAccess() {
        return access;
    }
}
