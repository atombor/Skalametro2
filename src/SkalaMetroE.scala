import scala.math.pow

object SkalaMetroE {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    val n = sc.nextInt();
    var a0 = 0;

    val inputArr = List.tabulate(n)(_ => sc.nextDouble())

    inputArr.map(gimmETheTenth).map(n => "%.4f".format(n)).foreach(println)

  }

  def gimmETheTenth(d: Double): Double = 1.0 + List.range(1, 10).map(n => pow(d, n) / fact(n)).sum

  def fact(f: Int): Int = {
    if (f <= 1)
      1
    else
      f * fact(f - 1)
  }

  def gimmTryScheiss(d: Double): Double = pow(d, 3)

}