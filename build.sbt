name := "streaming-finance-api-poc"

version := "0.1"

scalaVersion := "2.12.4"

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-optimise"
)


libraryDependencies ++= Seq(
  "com.github.tyagihas" % "scala_nats_2.11" % "0.3.0",
  "io.nats" % "jnats" % "1.0",
  "io.monix" %% "monix" % "2.2.4",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"
)

dependencyOverrides += "org.scala-lang" % "scala-library" % scalaVersion.value