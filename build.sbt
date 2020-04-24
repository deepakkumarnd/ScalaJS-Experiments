// This is an application with a main method
name := "Scala.js Experiments"

lazy val hello =
  (project in file("hello"))
    .settings(
      name := "Hello world",
      libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0",
      scalaVersion := "2.13.1", // or any other Scala version >= 2.11.12
      scalaJSUseMainModuleInitializer := true
    )
    .enablePlugins(ScalaJSPlugin)

lazy val canvas =
  (project in file("canvas"))
    .settings(
      name := "canvas",
      libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0",
      scalaVersion := "2.13.1", // or any other Scala version >= 2.11.12
      scalaJSUseMainModuleInitializer := true
    )
    .enablePlugins(ScalaJSPlugin)
