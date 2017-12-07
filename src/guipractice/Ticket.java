/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipractice;

import java.time.LocalDateTime;

/**
 *
 * @author cwerning
 */
public class Ticket {
    private static int ticketNumber;
    private LocalDateTime entryDate;
    private String garageName = "Chad's Garage";
    
    public Ticket(){
        ticketNumber = ticketNumber + 1;
        entryDate = LocalDateTime.now();
    }

    public static int getTicketNumber() {
        return ticketNumber;
    }

    public static void setTicketNumber(int ticketNumber) {
        Ticket.ticketNumber = ticketNumber;
    }

    public LocalDateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }

    public String getGarageName() {
        return garageName;
    }

    public void setGarageName(String garageName) {
        this.garageName = garageName;
    }
    
    
    
}
