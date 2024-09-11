package Model.Request;

public class RoomRequest {
    private Long id;
    private String customerName;
    private String phoneNumber;

    public RoomRequest(Long id, String customerName, String phoneNumber) {
        this.id = id;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
