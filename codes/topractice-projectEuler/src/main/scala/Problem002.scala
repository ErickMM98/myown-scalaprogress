object Problem002 {
  //Return the sum of the even number  of the Fibonacci sequence.

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
    val n : Int = 10000
    println( (1 until n ).map( x => fibTR(x) ).filter( x => x < 4000000).filter( x => x % 2 == 0).sum )
  }
}
