ThisBuild / scalaVersion := "3.5.2"

lazy val root = project
  .in(file("."))
  .aggregate(infra, backend)

lazy val infra = project
  .in(file("modules/infra"))
  .settings(
    libraryDependencies ++= Seq(
      "org.virtuslab" %% "besom-command" % "0.10.0-core.0.3"
    ),
    addCompilerPlugin(
      "org.virtuslab" %% "besom-compiler-plugin" % "0.3.2"
    )
  )

lazy val backend = project
  .in(file("modules/backend"))
