import scala.annotation.tailrec

object Recurssion {

  /*
  EXERCISE : Implement a Fibonacci function in a recursion way.
  Use a @tail annotation.

   */

  def fibbonacci( n: Int): Int = {
    //@annotation.tailrec
    def go(step : Int, x0 : Int , x1 : Int) : Int = {
      step match {
        case 0 => x0
        case 1 => x1
        case _ => go(step - 1, x0, x1 ) + go(step - 2, x0, x1 )
      }
    }
    go(n,0,1 )
  }


  def fibTR(num: Int): BigInt = {
    @scala.annotation.tailrec
    def fibFcn(n: Int, acc1: BigInt, acc2: BigInt): BigInt = n match {
      case 0 => acc1
      case 1 => acc2
      case _ => fibFcn(n - 1, acc2, acc1 + acc2)
    }

    fibFcn(num, 0, 1)
  }


  def main(args: Array[String]): Unit = {
    //println(fibbonacci(4))
    println(fibTR(1000))
  }
}
