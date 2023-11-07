package spring.swagger.model;

public class Fabric {
    private String fabricNo;
    private String description;

    public Fabric() {
    }

    public Fabric(String fabricNo, String description) {
        this.fabricNo = fabricNo;
        this.description = description;
    }

    public String getFabricNo() {
        return fabricNo;
    }

    public void setFabricNo(String fabricNo) {
        this.fabricNo = fabricNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
