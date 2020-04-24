package canvas

import org.scalajs.dom.CanvasRenderingContext2D

case class Point(x: Int, y: Int)

abstract class Sprite {
  def render(ctx: CanvasRenderingContext2D, color: String = "black"): Unit = {
    ctx.strokeStyle = color
    ctx.beginPath()
  }
}

class Line(start: Point, end: Point) extends Sprite {
  override def render(ctx: CanvasRenderingContext2D, color: String): Unit = {
    super.render(ctx, color)
    ctx.moveTo(start.x, start.y)
    ctx.lineTo(end.x, end.y)
    ctx.stroke
  }
}

class Circle(center: Point, radius: Int) extends Sprite {
  override def render(ctx: CanvasRenderingContext2D, color: String): Unit = {
    super.render(ctx, color)
    ctx.arc(center.x, center.y, radius, 0, 2 * Math.PI)
    ctx.fillStyle = color
    ctx.fill()
    ctx.stroke()
  }
}

class Box(start: Point, width: Int, height: Int) extends Sprite {
  override def render(ctx: CanvasRenderingContext2D, color: String): Unit = {
    super.render(ctx, color)
    ctx.fillStyle = color
    ctx.fillRect(start.x, start.y, width, height)
    ctx.stroke()
  }
}
