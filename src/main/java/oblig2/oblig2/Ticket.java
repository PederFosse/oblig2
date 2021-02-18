package oblig2.oblig2;

public class Ticket {
    private String fname;
    private String lname;
    private String phone;
    private String mail;
    private String movie;
    private int amount;

    public Ticket(String fname, String lname, String phone, String mail, String movie, int amount) {
        System.out.println("creating ticket");
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.mail = mail;
        this.movie = movie;
        this.amount = amount;
    }

    public Ticket() {}

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String toString() {
        return "Name: " + fname + " " + lname + ". Mail: " + mail + ". Movie: " + movie + ". Phone: " + phone
                + ". Tickets: " + amount;
    }
}
