import cats.kernel.Monoid

object Foo{
  /*
  In this code, we introduce some examples of CATS
   */

  // In the example, we need to reduce a array of elements.
  /*
      Array of int => The sum of the elments.
      Array of String => The concatenated string.
      Array of sets => The whole union.
   */

  // This is the primary group. It is similar to mathematical group; it has a set and a binary operation.
  trait Monoid[A] {
    // This is the init or empy value ( 0, "", {}). Or the group's zero.
    def empty: A
    // this is the Binary operation.
    def combine(x: A, y: A): A
  }


  // Implementation for Int
  val intAdditionMonoid: Monoid[Int] = new Monoid[Int] {
    def empty: Int = 0
    def combine(x: Int, y: Int): Int = x + y
  }

  //By @ErickMM98 : Implement the string case.
  val stringAdditionMonoid: Monoid[String] = new Monoid[String] {
    def empty: String = ""
    def combine(x: String, y: String): String = x ++ y
  }
  def main(args: Array[String]): Unit = {
    def combineAll[A](list: List[A], m: Monoid[A]): A = list.foldRight(m.empty)(m.combine)

    println(combineAll(List(1,2,3,4), intAdditionMonoid))
    println(combineAll(List("Hola", " mundo", ", soy", " cool"), stringAdditionMonoid))
  }

}
