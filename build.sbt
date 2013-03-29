name := "scalaz-monoid-example"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
    "org.scalacheck" %% "scalacheck" % "1.10+" % "test",
    "org.scalaz" %% "scalaz-core" % "7+",
    "org.scalaz" %% "scalaz-scalacheck-binding" % "7+" % "test",
    "org.specs2" %% "specs2" % "1.12+" % "test",
    "org.typelevel" %% "scalaz-specs2" % "0.1+" % "test"
)
