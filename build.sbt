ThisBuild / scalaVersion := "3.4.0"
ThisBuild / licenses += "ISC" -> url("https://opensource.org/licenses/ISC")
ThisBuild / versionScheme := Some("semver-spec")

publish / skip := true

name := "hello"

version := "0.0.1"

Compile / run / fork := true

scalacOptions ++= Seq(
  "-deprecation",
  "-explain",
  "-explain-types",
  "-new-syntax",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xmigration",
  "-feature",
  "-language:postfixOps",
  "-language:implicitConversions",
  "-language:existentials",
  "-language:dynamics",
)

organization := "io.github.edadma"
githubOwner := "edadma"
githubRepository := name.value
publishMavenStyle := true
Test / publishArtifact := false
