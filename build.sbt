name := "Solving"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies += "com.criteo.lolhttp" %% "lolhtml" % "10.0.0"

//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
//
//
//libraryDependencies +=  "org.scalaj" %% "scalaj-http" % "2.4.0"



//val http4sVersion = "0.19.0-SNAPSHOT"

// Only necessary for SNAPSHOT releases
//resolvers += Resolver.sonatypeRepo("snapshots")
//
//libraryDependencies ++= Seq(
//  "org.http4s" %% "http4s-dsl" % http4sVersion,
//  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
//  "org.http4s" %% "http4s-blaze-client" % http4sVersion
//)
//
////libraryDependencies ++= Seq(
////  "org.http4s" %% "http4s-dsl",
////)
//scalacOptions ++= Seq("-Ypartial-unification")