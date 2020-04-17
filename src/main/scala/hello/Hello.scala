package hello

import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.raw.{Element, Event}

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello World")
    val button: Element = document.getElementById("mybutton")

    button.addEventListener("click", { e: dom.MouseEvent =>
      println("Button clicked")
    })
  }
}
