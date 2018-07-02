name := "Solving"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies += "com.criteo.lolhttp" %% "lolhtml" % "10.0.0"

libraryDependencies ++= {
  val liftVersion = "3.2.0"
  Seq(
    "net.liftweb"       %% "lift-webkit" % liftVersion % "compile",
    "ch.qos.logback" % "logback-classic" % "1.2.3"
  )
}

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.7"


val circeVersion = "0.9.3"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)



libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"



