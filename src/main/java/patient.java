import java.time.LocalDate;

public class patient{
    String name;
    String img;
    int age;
    LocalDate scanDate;
    public patient(String name, String img, int age, LocalDate scanDate) {
        this.name=name;
        this.img=img;
        this.age=age;
        this.scanDate=scanDate;
    }

    public String getName(){
        return name;
    }

    public String getImg(){
        return img;
    }

    public int getAge(){
        return age;
    }

    public LocalDate getScanDate() {
        return scanDate;
    }

    public LocalDate getMeasurementDate() {
        return scanDate.plusDays(1);
    }
}
