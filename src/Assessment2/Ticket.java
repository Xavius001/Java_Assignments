package Assessment2;

import java.time.LocalDateTime;

public class Ticket {
    private String _ticketNo;
    private LocalDateTime _parkedTime;
    private double cost;

    public Ticket() {
        this._ticketNo = "";
        this._parkedTime = LocalDateTime.now();
        this.cost = 0;
    }

    public Ticket(String _ticketNo, LocalDateTime _parkedTime, double cost) {
        this._ticketNo = _ticketNo;
        this._parkedTime = _parkedTime;
        this.cost = cost;
    }

    public String get_ticketNo() {
        return _ticketNo;
    }

    public void set_ticketNo(String _ticketNo) {
        this._ticketNo = _ticketNo;
    }

    public LocalDateTime get_parkedTime() {
        return _parkedTime;
    }

    public void set_parkedTime(LocalDateTime _parkedTime) {
        this._parkedTime = _parkedTime;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
