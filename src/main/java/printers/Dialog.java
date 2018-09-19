package printers;

import plate.Plate;

import javax.swing.*;
import java.awt.*;

/**
 * Prints the plate in a nice dialog box.
 */
public final class Dialog implements Media<Plate> {

    /**
     * Decorated plate.
     */
    private final Plate plate;

    public Dialog (final Plate plate) {
        this.plate = plate;
    }

    @Override
    public void print() {
        JOptionPane.showMessageDialog(new Frame(), this.plate.asString());
    }
}
