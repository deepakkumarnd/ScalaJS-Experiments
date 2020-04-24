package hello

import org.scalajs.dom
import org.scalajs.dom.ext.Ajax
import org.scalajs.dom.html.Input
import org.scalajs.dom.{Node, document}
import org.scalajs.dom.raw.{Element, Event, MouseEvent}
import scala.concurrent.ExecutionContext.Implicits.global

object Hello {
  def main(args: Array[String]): Unit = {
    // console.log("Hello World")
    println("Hello World")
    // create a button
    val button: Element = document.createElement("button")
    button.id = "mybutton"
    button.innerHTML = "Click Me"
    // add an event listener for click event
    button.addEventListener("click", { e: dom.MouseEvent =>
      dom.window.alert("Button clicked now")
    })

    // add some style to button

    document.body.appendChild(button)

    val inputBox: Node = createWrappedInputText(id = "mytext")
    document.body.appendChild(inputBox)

    val starWarsApi = document.createElement("button")
    starWarsApi.innerHTML = "Fetch Weather"

    starWarsApi.addEventListener("click", { e: MouseEvent =>
      document.body.appendChild(fetchWeatherInfo)
    })

    document.body.appendChild(starWarsApi)
  }

  def fetchWeatherInfo: Node = {
    val div = document.createElement("div")
    val url = "https://swapi.dev/api/people/1/"
    Ajax
      .get(url)
      .foreach({ xhr =>
        val p = document.createElement("p")
        p.innerHTML = xhr.responseText
        div.appendChild(p)
      })
    div
  }

  def createWrappedInputText(id: "mytext"): Node = {
    val input = document.createElement("input").asInstanceOf[dom.html.Input]
    val p = document.createElement("p")

    input.id = id
    input.`type` = "text"

    input.addEventListener("keyup", { e: MouseEvent =>
      p.innerText = input.value
    })

    input.addEventListener("change", { e: MouseEvent =>
      p.innerText = input.value
      input.value = ""
    })

    input.style.width = "50%"
    input.style.height = "30px"
    input.style.fontSize = "20px"
    input.style.margin = "10px 0 10px 0"

    val div: Element = document.createElement("div")
    div.appendChild(input)
    div.appendChild(p)
    div
  }
}
