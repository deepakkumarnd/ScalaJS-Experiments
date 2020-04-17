enablePlugins(ScalaJSPlugin)

scalaVersion := "2.13.1" // or any other Scala version >= 2.11.12

// This is an application with a main method
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0"

lazy val root =
  (project in file("."))
    .enablePlugins(ScalaJSPlugin)
    .settings(
      name := "Scala.js Experiments",
      scalaJSUseMainModuleInitializer := true
    )

lazy val reactjs =
  (project in file("reactjs"))
    .settings(
      name := "ScalaJS with ReactJS",
      scalaJSUseMainModuleInitializer := true,
      libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "1.6.0",
      npmDependencies in Compile ++= Seq(
        "react" -> "16.7.0",
        "react-dom" -> "16.7.0"
      )
    )
    .enablePlugins(ScalaJSPlugin)
    .enablePlugins(ScalaJSBundlerPlugin)
