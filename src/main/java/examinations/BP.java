package examinations;

import java.time.LocalDate;

public class BP{
    int SP;
    int DP;
    LocalDate testDate;
    String type;
    public BP(int SP, int DP, LocalDate testDate, String type) {
        this.SP=SP;
        this.DP=DP;
        this.testDate=testDate;
        this.type=type;
    }

    public String getBP(){
        return SP+" over "+DP;
    }

    public LocalDate getDate(){
        return testDate;
    }

}
