// This is an application with a main method
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0"

name := "Scala.js Experiments"

scalaVersion := "2.13.1" // or any other Scala version >= 2.11.12

scalaJSUseMainModuleInitializer := true

enablePlugins(ScalaJSPlugin)
