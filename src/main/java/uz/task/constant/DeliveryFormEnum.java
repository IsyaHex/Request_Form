package uz.task.constant;

public enum DeliveryFormEnum {
    COURIER(1),
    EMAIL(2),
    TELEPHONOGRAM(3);

    private final Integer deliveryForm;

    DeliveryFormEnum(Integer value) {
        this.deliveryForm = value;
    }

    public Integer getDeliveryForm() {
        return deliveryForm;
    }
}
