// validate form
function validateForm(form) {
    if (!form.checkValidity()) { // if form is not valid
        form.classList.add('was-validated');
    } else {
        // form.reset();
        form.classList.remove('was-validated');
    }
}

// create a new ticket
function submitForm(event) {
    // prevent default form behaviour
    event.preventDefault();
    const form = $('#form')[0];

    // form validation
    validateForm(form);

    // make new ticket
    const ticket = {
        fname: $("#fname").val(),
        lname: $("#lname").val(),
        phone: $("#phone").val(),
        mail: $("#mail").val(),
        movie: $("#movie").val(),
        amount: $("#amount").val(),
    }

    // POST ticket to the server
    $.post("/tickets", ticket, () => {
        getTickets(); // get tickets and update webpage
    })
}

// GET all tickets from server
function getTickets() {
    $.get("/tickets", (data) => {
        const formattedTickets = formatTickets(data); // format tickets
        $("#ticketTable").html(formattedTickets); // print formatted tickets to webpage
    })
}

// Format all tickets
function formatTickets(tickets) {
    let ut = '';
    for (let ticket of tickets) {
        ut += `
            <tr>
                <td>${ticket.fname}</td>
                <td>${ticket.lname}</td>
                <td>${ticket.phone}</td>
                <td>${ticket.mail}</td>
                <td>${ticket.movie}</td>
                <td>${ticket.amount}</td>
            </tr>
        `
    }
    return ut;
}

// Delete all tickets
function deleteTickets() {
    $.post("/delete", {}, () => {
        getTickets(); // get tickets and update webpage
    })
}