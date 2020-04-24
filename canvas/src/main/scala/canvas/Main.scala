package canvas

import org.scalajs.dom
import org.scalajs.dom._

object Main {
  def main(args: Array[String]): Unit = {
    val height = 600
    val width = 600

    val p =
      document.createElement("p")
    p.innerText = "Welcome to ScalaJS Experiment using <canvas>"
    document.body.appendChild(p)

    val canvas: html.Canvas =
      document.createElement("canvas").asInstanceOf[html.Canvas]
    canvas.id = "mycanvas"
    canvas.height = height
    canvas.width = width
    canvas.style.border = "solid 1px #000"

    document.body.appendChild(canvas)
    val ctx = canvas.getContext("2d").asInstanceOf[CanvasRenderingContext2D]

    // draw a line
    val line = new Line(Point(0, 0), Point(600, 600))
    line.render(ctx)
    // draw a circle
    val circle = new Circle(Point(400, 400), 100)
    circle.render(ctx, "cyan")
    // draw a box
    val box = new Box(Point(100, 100), 200, 200)
    box.render(ctx, "red")
  }
}
