package main;

import acs.cts.singleton.Hotel;

public class Main {
    static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("Muntenia", 7, 5);
        Hotel hotel2 = Hotel.getInstance("La Cabanuta", 200, 0);

        hotel1.rezervaCamera();
        hotel1.rezervaCamera();

        hotel2.rezervaCamera();
        hotel2.rezervaCamera();

    }
}
