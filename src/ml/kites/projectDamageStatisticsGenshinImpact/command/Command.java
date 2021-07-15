package ml.kites.projectDamageStatisticsGenshinImpact.command;

public class Command {
    private String type;
    private double value;

    public Command(String type,double value){
        this.type = type;
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
