package com.lesson6;

import java.time.LocalDateTime;

public class Place {
    private Client client;
    private LocalDateTime bookTime;


    public Place() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public LocalDateTime getBookTime() {
        return bookTime;
    }

    public void setBookTime(LocalDateTime bookTime) {
        this.bookTime = bookTime;
    }

    public boolean isFree (){
        return (client == null && bookTime == null);
    }



}
