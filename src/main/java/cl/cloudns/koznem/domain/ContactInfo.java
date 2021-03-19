package cl.cloudns.koznem.domain;

public class ContactInfo {
    private String fullName;
    private String email;
    private String mobileNumber;
    private String topic;
    private String message;

    public ContactInfo() {

    }

    public ContactInfo(String fullName, String email, String mobileNumber, String topic, String message) {
        this.fullName = fullName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.topic = topic;
        this.message = message;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
