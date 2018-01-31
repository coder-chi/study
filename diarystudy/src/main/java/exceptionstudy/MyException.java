package exceptionstudy;

public class MyException extends Exception {
    private String content = "我定义的异常";

    public String getContent() {
        return content;
    }
}
