object Problem001 {
  // Find the multiples of 3 or 5 and sum it.

  val n : Int = 1000

  def getMultiplie( x : Int ): Boolean = {
    if ( x % 5 == 0  ||  x % 3 == 0 )
      true
    else
      false
  }

  def main(args: Array[String]): Unit = {
    println( (1 until n).filter( x => getMultiplie(x)).sum  )
  }

}
