resolvers ++= Seq(
  Resolver.bintrayIvyRepo("epfl-lara", "sbt-plugins"),
  Resolver.bintrayRepo("epfl-lara", "princess"),
  "uuverifiers" at "http://logicrunch.research.it.uu.se/maven",
)

val StainlessVersion = "0.2.2"

addSbtPlugin("ch.epfl.lara" % "sbt-stainless" % StainlessVersion)

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.28")

