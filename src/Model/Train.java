package Model;

public class Train {
    private int trainNumber;
    private String trainName;
    private TrainType trainRype;
    public Train(int trainNumber, String trainName, TrainType trainRype) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.trainRype = trainRype;
    }
   
    public int getTrainNumber() {
        return trainNumber;
    }
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
    public String getTrainName() {
        return trainName;
    }
    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }
    public TrainType getTrainRype() {
        return trainRype;
    }
    public void setTrainRype(TrainType trainRype) {
        this.trainRype = trainRype;
    }
    
    
}
