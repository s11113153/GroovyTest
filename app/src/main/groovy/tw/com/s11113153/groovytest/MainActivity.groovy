package tw.com.s11113153.groovytest

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

public class MainActivity extends Activity {
  TextView mtvInfo
  Student mStudent

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main)
    init()
    showInfo()
  }

  @MadeBy(name = 'xuyouren', date = '15/3/11')
  private void init() {
    mtvInfo = findViewById(R.id.tvInfo) as TextView
    mStudent = new Student()
  }

  private void showInfo() {
    mtvInfo.setText(
      "name = $mStudent.name, "   +
      "grade = $mStudent.grade, " +
      "height = $mStudent.height"
    )
  }
}
