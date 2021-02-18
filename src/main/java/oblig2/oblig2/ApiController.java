package oblig2.oblig2;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {
//  initialize tickets array
    private List<Ticket> TicketArray = new ArrayList<>();

    @GetMapping("/tickets")
    public List<Ticket> getTicketArray() {
        System.out.println("Recieved GET request to endpoint: /tickets \nReturn ticket array.");
        return TicketArray;
    }

    @PostMapping("/tickets")
    public void createTicket(Ticket ticket) {
        System.out.println("Recieved POST request to endpoint: /tickets \nAdding ticket to ArrayList: TicketArray");
        System.out.println("Ticket created:\t" + ticket);
        TicketArray.add(ticket);
    }

    @PostMapping("/delete")
    public void deleteAllTickets() {
        System.out.println("Recieved DELETE request to endpoint: /tickets \nClearing ArrayList: TicketArray.");
        TicketArray.clear();
    }
}
