package tw.com.s11113153.groovytest;

/**
 * Created by xuyouren on 15/3/11.
 */
public interface Message {
  enum Status {
    SUCCESSFUL, FAILURE;
  }
  void getInfo(Message.Status status, String message);
}
