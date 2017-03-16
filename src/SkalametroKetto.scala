
object SkalametroKetto {

  def main(args: Array[String]) {

    var i = 1
    for (i <- i to 1 by -1 ) {

//      println("Szerbusz " + i);
    }


    val listReplicationVal = listReplication(2, List(1, 2, 3, 4, 5, 6))
    //listReplicationVal.foreach(println)

    val delim = 3
    val filteredList = listReplicationVal.filter(n => n<delim)
//    filteredList.foreach(println)

    println(" - - - - - - - - - - - - - - ")

    val ints = List(8, 15, 22, 1, 10, 6, 2, 18, 18, 1, 3)
    val listOddPartVal = listOddPart(ints)
//    listOddPartVal.foreach(println)

    val listReversed = List.tabulate(ints.size) (n => ints(ints.size-n-1))
//    listReversed.foreach(print)

    println("\n - - - - - - - - - - - - - - ")
//    println(sumOddPart(List(1, 2, 3, 4, 5, 9)))
//    println(sumOddPart(List(2,6,8,9,4,5,-1)))
//
//    println(countOfListMembers(ints))

    println("\n - - - - - - - - - - - - - - ")

    println(absoluteList(List(8, 15, 22, -11, 10 )))

  }

  def listReplication(num:Int,arr:List[Int]):List[Int] = {
//    val returnArr = new List[Int]
//    for (i <- 1 to num ; j <- 1 to arr.size ) {
//      println("Szerbusz " + i + "  j: " + j )
//
//      returnArr(i*j) = i
//
//    }

    List.tabulate(num*arr.size)(n => arr(n/num))
  }

  def listOddPart(arr:List[Int]):List[Int] = List.tabulate(arr.size/2)(n => arr(n*2+1))
  def sumOddPart(arr:List[Int]):Int = arr.filter(n => n % 2 != 0).sum

  def countOfListMembers(arr:List[Int]):Int = {
    var c = 0
    arr.foreach(x => c += 1)
    return c
  }

  def absoluteList(arr:List[Int]):List[Int] = {
    List.tabulate(arr.size)(n => {
      if (arr(n) < 0) {
        arr(n) * -1
      }
      else {
        arr(n)
      }
    })
  }

}
