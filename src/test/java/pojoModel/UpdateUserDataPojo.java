package pojoModel;

public class UpdateUserDataPojo {

    private String name;
    private String job;


    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    private String createdAt;

    private String updatedAt;


    public UpdateUserDataPojo()
    {

    }
    public UpdateUserDataPojo(String name, String job)
    {
        this.name=name;
        this.job=job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCreatedAt() {
        return updatedAt;
    }

    public void setCreatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }




}
