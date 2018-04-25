lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(verified)
  .settings(commonSettings)
  .settings(
    name := "2048",
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.5"
  )

lazy val verified = (project in file("verified"))
  .enablePlugins(StainlessPlugin, ScalaJSPlugin)
  .settings(commonSettings)

def commonSettings = Seq(
  scalaVersion := "2.11.8"
)
