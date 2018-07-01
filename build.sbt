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

//resolvers += Resolver.sonatypeRepo("releases")
//libraryDependencies += "org.spire-math" %% "jawn-parser" % "0.12.1"
//
//libraryDependencies += "org.spire-math" %% "jawn-ast" % "0.12.1"

//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"



