package tw.com.s11113153.groovytest

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

public class MainActivity extends Activity {
  public static final String mSimpleLog = MainActivity.getSimpleName()
  TextView mtvInfo
  Student mStudent1, mStudent2
  def mMessageImp;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main)
    init()
    mStudent1 = new Student('s11113153', 180)
    mStudent2 = new Student(name: 'xuyouren', height: 184)
    Student.showInfo(mtvInfo, mMessageImp, mStudent1, mStudent2)
  }

  @MadeBy(name = 'xuyouren', date = '15/3/11')
  private void init() {
    mtvInfo = findViewById(R.id.tvInfo) as TextView
    mMessageImp = [
      getInfo : {
        Message.Status status, String message ->
          Log.v(mSimpleLog, "status = $status")
          Log.v(mSimpleLog, "message = $message")
      }
    ] as Message
  }
}
