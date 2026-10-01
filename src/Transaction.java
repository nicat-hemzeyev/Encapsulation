import java.time.LocalDateTime;

public class Transaction {
    private Integer id=0;
    private Long ammount;
    private LocalDateTime timestamp;

    public Transaction(){
        this.id++;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getAmmount() {
        return ammount;
    }

    public void setAmmount(Long ammount) {
        this.ammount = ammount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", ammount=" + ammount +
                ", timestamp=" + timestamp +
                '}';
    }
}
