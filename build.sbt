ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

lazy val root = (project in file("."))
  .settings(
    name := "kafka-consumer-message-formatter",
    idePackagePrefix := Some("io.cambi")
  )

libraryDependencies += "org.apache.kafka" %% "kafka" % "2.7.0"
ThisBuild / assemblyMergeStrategy := {
  case PathList("META-INF", _*) => MergeStrategy.discard
  case _                        => MergeStrategy.first
}