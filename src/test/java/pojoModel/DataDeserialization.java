package pojoModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataDeserialization {


    private int id;
    private String email;

    @JsonProperty("first_name")
    private String first_name;
    @JsonProperty("last_name")
    private String last_name;
    private String avatar;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @JsonProperty("first_name")
    public String getFirst_name() {
        return first_name;
    }
    @JsonProperty("first_name")
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    @JsonProperty("last_name")
    public String getLast_name() {
        return last_name;
    }
    @JsonProperty("last_name")
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }





}
