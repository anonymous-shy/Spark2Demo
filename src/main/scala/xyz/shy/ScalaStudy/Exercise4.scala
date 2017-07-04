package xyz.shy.ScalaStudy

/**
  * Created by AnonYmous_shY on 2016/7/22.
  * 模式匹配
  */
class Exercise4 {
}

object Exercise4 extends App {

  val value = 1
  private val s: String = value match {
    case 1 => "one"
    case 2 => "two"
    case _ => "others"
  }

  private val s1: String = value match {
    case i if i == 1 => "one"
    case i if i == 2 => "two"
    case _ => "others"
  }

  def t(obj: Any) = obj match {
    case x: Int => println("Int")
    case y: String => println("String")
    case _ => println("others")
  }

  println(s1)
  t(1)
  println(s)

}
