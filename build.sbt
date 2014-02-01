name := "scalaz-monoid-example"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
    "org.scalacheck" %% "scalacheck" % "1.10.1" % "test",
    "org.scalaz" %% "scalaz-core" % "7.0.5",
    "org.scalaz" %% "scalaz-scalacheck-binding" % "7.0.5" % "test",
    "org.specs2" %% "specs2" % "1.12.3" % "test",
    "org.typelevel" %% "scalaz-specs2" % "0.1.5" % "test"
)
