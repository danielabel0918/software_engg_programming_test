import examinations.BP;
import examinations.MRI;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        patient patient1 = new patient("Daphne Von Oram", "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg", 62, LocalDate.of(2023, 9, 14));
        patient patient2 = new patient("Sebastian Compton", "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg", 31, LocalDate.of(2023, 11, 19));

    }
}