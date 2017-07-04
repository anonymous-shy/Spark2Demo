package xyz.shy

/**
  * Created by Shy on 2017/6/21.
  */
object Test extends App {

  val DATA_PATH = "hdfs://tagticHA/user/shy/data/ml-1m/"
  println(s"${DATA_PATH}users.dat")
  val schemaString = List("1::F::1::10::48067", "2::M::56::16::70072", "3::M::25::15::55117", "4::M::45::7::02460", "5::M::25::20::55455")
  val iter = Iterator(schemaString.map(_.split("::")))
  iter.foreach(println)

  val m = Map("shy" -> 1)
  println(m.apply("shy"))
}
