ThisBuild / scalaVersion     := "3.3.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "intellij-doobie-syntax-error",
    libraryDependencies += "org.tpolecat" %% "doobie-core" % "1.0.0-RC1"
  )
