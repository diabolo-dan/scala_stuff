import scala.reflect.ClassTag

/*
simple example of how class tags work for reference purposes.

I couldn't easily find a similar enough example online when I needed it.
 */

sealed trait Base

case class A() extends Base
case class B() extends Base


object ClassTagDemo {

  def typeFilter[T <: Base : ClassTag](list: Seq[Base]): Seq[T] =
    list.collect {
      case x: T => x
    }

  def main(args: Array[String]): Unit = {
    val original = Seq(A(), B(), A())
    val filtered = typeFilter[A](original)
    print(filtered)
  }

}


