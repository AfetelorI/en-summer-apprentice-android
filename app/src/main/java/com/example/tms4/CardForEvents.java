package com.example.tms4;

public class CardForEvents {
    String nume_event;
    String descriere_event;
    int image_event;

    public CardForEvents(String nume_event, String descriere_event, int image_event) {
        this.nume_event = nume_event;
        this.descriere_event = descriere_event;
        this.image_event = image_event;
    }

    public String getNume_event() {
        return nume_event;
    }

    public String getDescriere_event() {
        return descriere_event;
    }

    public int getImage_event() {
        return image_event;
    }
}
