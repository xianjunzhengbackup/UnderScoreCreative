ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.8"

lazy val root = (project in file("."))
  .settings(
    name := "UnderScoreIOCreative"
  )

// resolvers += Resolver.bintrayRepo("underscoreio", "training")

//initialCommands in console := """
//                                |import doodle.core._
//                                |import doodle.image._
//                                |import doodle.image.syntax._
//                                |import doodle.image.syntax.core._
//                                |import doodle.java2d._
//    """.trim.stripMargin

libraryDependencies ++= Seq(
  "org.creativescala" %% "doodle" % "0.9.6",
  "org.creativescala" %% "doodle-reactor" % "0.9.6"
)