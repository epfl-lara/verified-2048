addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.22")

resolvers += Resolver.url("LARA sbt plugins releases",url("https://dl.bintray.com/epfl-lara/sbt-plugins/"))(Resolver.ivyStylePatterns)
addSbtPlugin("ch.epfl.lara" % "sbt-stainless" % "0.1.0-47dd12764fc060ebcd46ad5f9e1b40adbe3aeaed")