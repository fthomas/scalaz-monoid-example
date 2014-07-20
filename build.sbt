name := "scalaz-monoid-example"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
    "org.scalacheck" %% "scalacheck" % "1.11.4" % "test",
    "org.scalaz" %% "scalaz-core" % "7.0.6",
    "org.scalaz" %% "scalaz-scalacheck-binding" % "7.0.6" % "test",
    "org.specs2" %% "specs2" % "2.3.13" % "test",
    "org.typelevel" %% "scalaz-specs2" % "0.2" % "test"
)
