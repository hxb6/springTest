package test.pojo;

public class CarInfo {
    private String carId;

    private String carName;

    private String carColor;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName == null ? null : carName.trim();
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor == null ? null : carColor.trim();
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "carId='" + carId + '\'' +
                ", carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                '}';
    }
}