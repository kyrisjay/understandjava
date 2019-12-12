package practise.aggregate.pra2.selectCourse;

public class course {
    private int id;
    private String couName;

    public course(){

    }

    public course(int id, String couName) {
        this.id = id;
        this.couName = couName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCouName() {
        return couName;
    }

    public void setCouName(String couName) {
        this.couName = couName;
    }
}
