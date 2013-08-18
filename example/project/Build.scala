import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "ajaxpopup_example"
  val appVersion      = "0.1"

  val appDependencies = Seq(
    javaCore,
    javaJdbc,
    javaEbean,
    "ajaxpopup" % "ajaxpopup_2.10" % "0.1"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers += "Local Play Repository" at "file://C:/Users/Administrator/play_framework/play/repository/local"
  )

}
