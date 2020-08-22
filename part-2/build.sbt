name := "sbt-multi-module-solution"

version := "1.0"

scalaVersion := "2.13.3"

// PROJECTS

lazy val global = project
  .in(file("."))
  .aggregate(
    core,
    utils
  )

lazy val core = project
  .settings(
    name := "core",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.1" % "test"
  ).dependsOn(utils)

lazy val utils = project
  .settings(
    name := "utils"
  )
