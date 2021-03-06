import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "HUKParser"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    "postgresql" % "postgresql" % "8.4-702.jdbc4",
    "org.jsoup" % "jsoup" % "1.7.2",
    javaCore,
    javaJdbc,
    javaEbean
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
