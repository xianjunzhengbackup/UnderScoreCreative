package ComputingWithPicture

import doodle.core._
import doodle.image._
import doodle.image.syntax._
import doodle.image.syntax.core._
import doodle.java2d._

object ShapeAndColor extends App{
  //分别出现三张图
//  Image.circle(10).draw()
//  Image.rectangle(100, 50).draw()
//  Image.triangle(100,50).draw()

  //将三张图集中在同一个layout中
  Image.circle(10).beside(Image.rectangle(10, 20)).
    beside(Image.triangle(100,50)).draw()

  Image.circle(20).beside(Image.circle(20)).beside(Image.circle(20)).on(Image.circle(60)).draw()

  (Image.circle(100).fillColor(Color.darkBlue))
    .under(Image.circle(50).fillColor(Color.white))
    .under(Image.circle(30).fillColor(Color.cornflowerBlue))
    .under(Image.circle(20).fillColor(Color.black)).draw()

  //----------------------------------------------------------------------------------
  //For RGB value which is converted from Int to Unsigned Byte
  //转换过程中太大或是太小都会处理成最接近的值
  println(0.uByte.get)
  // res0: Int = 0
  println(255.uByte.get)
  // res1: Int = 255
  println(128.uByte.get)
  // res2: Int = 128
  println(-100.uByte.get) // Too small, is transformed to 0
  // res3: Int = 0 // Too small, is transformed to 0
  println(1000.uByte.get) // Too big, is transformed to 255
  // res4: Int = 255

  Color.rgb(255.uByte, 255.uByte, 255.uByte) // White
  Color.rgb(0.uByte, 0.uByte, 0.uByte) // Black
  Color.rgb(255.uByte, 0.uByte, 0.uByte) // Red

  Image.circle(100).fillColor(Color.red)
    .beside(Image.circle(100).fillColor(Color.red.spin(15.degrees)))
    .beside(Image.circle(100).fillColor(Color.red.spin(30.degrees)))
    .strokeWidth(5.0).draw()

  def boxes(color: Color): Image = {
    val box =
      Image.rectangle(40, 40).
        strokeWidth(5.0).
        strokeColor(color.spin(30.degrees)).
        fillColor(color)
    box beside box beside box beside box beside box
  }
  // Create boxes with different colors
  boxes(Color.paleGoldenrod).draw()
  boxes(Color.lightSteelBlue).draw()
  boxes(Color.mistyRose).draw()
}
