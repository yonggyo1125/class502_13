package members;

import java.time.LocalDateTime;

public class Member {
    private long USER_NO;
    private String USER_ID;
    private String USER_PW;
    private String USER_NM;
    private int AGE;
    private LocalDateTime REG_DT;

    public long getUSER_NO() {
        return USER_NO;
    }

    public void setUSER_NO(long USER_NO) {
        this.USER_NO = USER_NO;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSER_PW() {
        return USER_PW;
    }

    public void setUSER_PW(String USER_PW) {
        this.USER_PW = USER_PW;
    }

    public String getUSER_NM() {
        return USER_NM;
    }

    public void setUSER_NM(String USER_NM) {
        this.USER_NM = USER_NM;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public LocalDateTime getREG_DT() {
        return REG_DT;
    }

    public void setREG_DT(LocalDateTime REG_DT) {
        this.REG_DT = REG_DT;
    }

    @Override
    public String toString() {
        return "Member{" +
                "USER_NO=" + USER_NO +
                ", USER_ID='" + USER_ID + '\'' +
                ", USER_PW='" + USER_PW + '\'' +
                ", USER_NM='" + USER_NM + '\'' +
                ", AGE=" + AGE +
                ", REG_DT=" + REG_DT +
                '}';
    }
}
