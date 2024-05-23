package games;


import java.io.Serializable;

public class Data implements Serializable {
    private String from; // 보내는 쓰레드명
    private String to; // 받는 쓰레드명
    private Object data;

    public Data(String from, String to, Object data) {
        this.from = from;
        this.to = to;
        this.data = data;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", data=" + data +
                '}';
    }
}
