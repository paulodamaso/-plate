package com.plates.mercosul.printers;

import com.plates.mercosul.plate.Plate;

/**
 * Prints {@link Plate} objects to the console.
 */
public final class Console implements Media<Plate> {

    private final Plate plate;

    public Console(final Plate plate){
        this.plate = plate;
    }

    @Override
    public void print() {
        System.out.println(plate.asString());
    }
}
