package practise.aggregate.pra3;

import java.util.LinkedHashMap;

public class TestQuestions {
    private int qNum;
    private String title;
    private static int temp;
    private String[] select = {"A", "B", "C", "D"};
    private String answer;
    static LinkedHashMap<String, String> hm= new LinkedHashMap<>();

    public TestQuestions(String title, String answer) {
        this.title = title;
        this.answer = answer;
        temp++;
        qNum = temp;
        hm.put(qNum + "." + title, answer);
    }

    public int getqNum() {
        return qNum;
    }

    public void setqNum(int qNum) {
        this.qNum = qNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static int getTemp() {
        return temp;
    }

    public static void setTemp(int temp) {
        TestQuestions.temp = temp;
    }

    public String[] getSelect() {
        return select;
    }

    public void setSelect(String[] select) {
        this.select = select;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public static LinkedHashMap<String, String> gethm() {
        return hm;
    }

    public static void setLhm(LinkedHashMap<String, String> hm) {
        TestQuestions.hm = hm;
    }
}
