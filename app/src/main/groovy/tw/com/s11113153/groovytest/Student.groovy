package tw.com.s11113153.groovytest

import android.widget.TextView

class Student {
  def name, height, grade

  /**
   * @param name    ： must set
   * @param height  ： must set
   * @param grade   ： default 4
   */
  Student(String name , int height, int grade = 4) {
    this.name = name
    this.grade = grade
    this.height = height
  }

  Student(Map map) {
    this.grade = 4
    map?.each { k , v -> this[k] = v }
    if (this.name == null || this.name == '')
            throw new IllegalArgumentException("name must != null && ''")
    if (this.height < 0)
            throw new IllegalArgumentException("height must > 0")
  }

  static void showInfo(TextView textView, Message message, Student... students) {
    String content = '', msg = ''
    boolean b = Boolean.valueOf(false)

    students?.each {
      if (b) return
      if (it == null) {
        msg = 'Student Object is null'
        return (b = true)
      }
      content += "name = $it.name, grade = $it.grade, height = $it.height"
      content += '\n'
    }

    if (b) {
      message.getInfo(Message.Status.FAILURE, msg)
      return
    }
    textView.setText(content)
    message.getInfo(Message.Status.SUCCESSFUL, "no problem")
  }
}