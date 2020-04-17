package reactjs

import japgolly.scalajs.react._
// In scala the JSX is written differently, the tags start with < for example <.div for a div tag,
// and attributes in each tag start with ^., eg; ^.className := "myclass"
import japgolly.scalajs.react.vdom.html_<^._


object Component {
  val welcome = ScalaComponent.builder
}
