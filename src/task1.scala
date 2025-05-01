import scala.collection.IterableOnce.iterableOnceExtensionMethods
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

trait ArrayFactory {
  def create(size: Int): Array[Int] = ???
}

trait Sort {
  def sort(a: Array[Int]): Array[Int] = ???
}

object RandomArrayFactory extends ArrayFactory{
  override def create(size: Int): Array[Int] ={
    val a: Array[Int] = Array.ofDim(size)
    for(i <- a.indices) {
      a(i) = (math.random() * size).toInt
    }
    return a
  }
}

object InvertedSortedArrayFactory extends ArrayFactory{
  override def create(size: Int): Array[Int] ={
    val a: Array[Int] = Array.range(size-1, -1, -1)
    a
  }
}

object ShuffleArrayFactory extends ArrayFactory{
  override def create(size: Int): Array[Int] ={
    val a: Array[Int] = Array.ofDim(size)
    var c = 0
    for (i <- a.indices){
      if (i % 2 == 0) {
        a(i) = c
        c += 1
      }
      else a(i) = size - c
    }
    a
  }
}

object AlmostSortedArrayFactory extends ArrayFactory{
  var cst = 30
  override def create(size: Int): Array[Int] ={
    val b : Array[Int] = Array.fill(size)(-1)
    val c = ((cst.toDouble / 100.0) * size).toInt
    val lastRandNum : ArrayBuffer[Int] = ArrayBuffer.empty
    val lastRandPos : ArrayBuffer[Int] = ArrayBuffer.empty
    for (i <- 1 to c){
      var randNum = (math.random * (size-1)).toInt
      var randPos = (math.random * (size-1)).toInt
      while (lastRandNum.contains(randNum)) randNum = (math.random * (size-1)).toInt
      lastRandNum += randNum
      while (lastRandPos.contains(randPos)) randPos = (math.random * (size-1)).toInt
      lastRandPos += randPos
      b(randPos) = randNum
    }
    var r = 0
    for (j <- b.indices){
      if (b(j) == -1){
        while (b.contains(r)){
          r += 1
        }
        b(j) = r
      }
    }
    b
  }
}

object SelectionSort extends Sort{
  override def sort(a: Array[Int]): Array[Int] = {
    for (i <- a.indices) {
      var smallestIndex = i
      for (j <- i + 1 until a.length) {
        if (a(j) < a(smallestIndex)) smallestIndex = j
      }
      val temp = a(smallestIndex)
      a(smallestIndex) = a(i)
      a(i) = temp
    }
    a
  }
}

/** asdfasdf
 *  */ object YSort /* */ /* extends Youpi */ extends Sort {override def sort(/** *("* ")
 * */
                                                                     KKJAaJY: Array[Int]): Array[Int] = {   if (KKJAaJY.length > 1) {val PpPPP11PPp_____ = KKJAaJY.length / 2; val ajskfd = KKJAaJY.length - PpPPP11PPp_____
  var aöAöEEEE = new Array[Int](PpPPP11PPp_____)
  var asAa = new Array[Int](ajskfd)
  for (nantAPoUet
         <- 0// // // // // /// ///// //// // ////
    until/// // // < // /> />/> //>//>/>/ *//(*/// //
    PpPPP11PPp_____)

  { ;
    aöAöEEEE(nantAPoUet)=
    /** ***            asjkdfasdf
     * asfjdkasldf
     * asdfjkasdf
     *
     * as */  KKJAaJY(nantAPoUet)//
    //
    //
  }
  for (i <- PpPPP11PPp_____
    until PpPPP11PPp_____ + ajskfd) {
    asAa(i - PpPPP11PPp_____) = KKJAaJY(i)
    ;; ; ;;;; ; ;; ;; ; ; ; ;; ;      } ; ;;; ; ;;; ;; ;; ;

  aöAöEEEE = sort(aöAöEEEE); asAa = sort(asAa)
  var sadfkasjdfUUUUAA272772727127181871781778171asdahfasjkdfk,ISCSICISCISICICISICSICISICSI1,fooBABARAasdfjasldfkasdJISC = 0;     while ( {
    aöAöEEEE.length != ISCSICISCISICICISICSICISICSI1 && asAa.length != fooBABARAasdfjasldfkasdJISC
  }) if (aöAöEEEE(ISCSICISCISICICISICSICISICSI1) <= asAa(fooBABARAasdfjasldfkasdJISC)) {
    KKJAaJY(sadfkasjdfUUUUAA272772727127181871781778171asdahfasjkdfk) = aöAöEEEE(ISCSICISCISICICISICSICISICSI1)
    sadfkasjdfUUUUAA272772727127181871781778171asdahfasjkdfk += 1; ((((
      (((
        ISCSICISCISICICISICSICISICSI1 += (((1))
          ))))))
      ))
  } /** else else else while else */ else {
    KKJAaJY(sadfkasjdfUUUUAA272772727127181871781778171asdahfasjkdfk) =
      asAa(fooBABARAasdfjasldfkasdJISC)

    sadfkasjdfUUUUAA272772727127181871781778171asdahfasjkdfk += 1
    fooBABARAasdfjasldfkasdJISC += 1
  };while ( {
    aöAöEEEE.length != ISCSICISCISICICISICSICISICSI1
  }) {
    KKJAaJY(sadfkasjdfUUUUAA272772727127181871781778171asdahfasjkdfk) = aöAöEEEE(ISCSICISCISICICISICSICISICSI1)
    sadfkasjdfUUUUAA272772727127181871781778171asdahfasjkdfk += 1
    ;;; ; ;; ; ;; ; ;; ; ;; ISCSICISCISICICISICSICISICSI1 += 1 ; ; ;; // ; ;  ; ; ;; ; ;
    //		}
  }
  //; ; ; ;
  ; ;
  ;
  ;;
  ;;; ; ; ; ; ;;; ; ; ; ; ;;; ; ; ; ;; ; ;  ; ; ;;
  while ( {
    asAa.length != fooBABARAasdfjasldfkasdJISC ; ; ;;; ; ;; ;; ; ;; ; ; ;
  }) {
    KKJAaJY(sadfkasjdfUUUUAA272772727127181871781778171asdahfasjkdfk) = asAa(fooBABARAasdfjasldfkasdJISC)
    sadfkasjdfUUUUAA272772727127181871781778171asdahfasjkdfk += 1
    fooBABARAasdfjasldfkasdJISC += 1
  }
}
  //
  KKJAaJY
}
}

class SortApplication {
  def displayArray(a: Array[Int]) = println(a.mkString(", "))

  def measureTimeFile(sort: Sort, fileName: String): String = {
    val lines: Array[String] = Source.fromFile(fileName).getLines().toArray
    val array: Array[Int] = Array.ofDim(lines.length)
    for (i <- array.indices) array(i) = lines(i).toInt
    var res = ""
    val times = for (_ <- 1 to 10) yield {
      val start = System.nanoTime()
      sort.sort(array)
      val end = System.nanoTime()
      (end - start) / 1e6
    }
    res = (times.sum / 10).toString
    res
  }

  def measureTimeArray(sort: Sort, a: Array[Int]): String = {
    var res = ""
    val times = for (_ <- 1 to 10) yield {
      val start = System.nanoTime()
      sort.sort(a)
      val end = System.nanoTime()
      (end - start) / 1e6
    }
    res = (times.sum / 10).toString
    res
  }

  def findMaxSizeUnderOneSecond(sort: Sort, factory: ArrayFactory): Int = {
    val targetMillis = 1000.0
    val tolerance = 0.1 // 10%
    var low = 50000
    var high = 100000
    var result = 0

    while (low <= high) {
      val mid = (low + high) / 2
      val array = factory.create(mid)
      val start = System.currentTimeMillis()
      sort.sort(array)
      val end = System.currentTimeMillis()
      val elapsed = end - start

      if (math.abs(elapsed - targetMillis) <= targetMillis * tolerance) {
        return mid // trouvé
      } else if (elapsed < targetMillis) {
        result = mid
        low = mid + 1
      } else {
        high = mid - 1
      }
    }

    result
  }
}

object task1 extends App {
  val sa = new SortApplication

  val files: Array[String] = Array("data/10k.csv", "data/20k.csv", "data/30k.csv", "data/40k.csv",
    "data/50k.csv", "data/60k.csv", "data/70k.csv", "data/80k.csv", "data/90k.csv", "data/100k.csv")

  val factoryArray: Array[ArrayFactory] = Array(RandomArrayFactory, InvertedSortedArrayFactory, ShuffleArrayFactory)

  sa.measureTimeArray(YSort, RandomArrayFactory.create(10000))

  //for (i <- files.indices) println(sa.measureTimeFile(SelectionSort, files(i)))
  //for (i <- files.indices) println(sa.measureTimeFile(YSort, files(i)))

  //for(i <- 10000 to 100000 by 10000) println(sa.measureTimeArray(SelectionSort, RandomArrayFactory.create(i)))
  //for(i <- 10000 to 100000 by 10000) println(sa.measureTimeArray(YSort, RandomArrayFactory.create(i)))

  //for(i <- 10000 to 100000 by 10000) println(sa.measureTimeArray(SelectionSort, InvertedSortedArrayFactory.create(i)))
  //for(i <- 10000 to 100000 by 10000) println(sa.measureTimeArray(YSort, InvertedSortedArrayFactory.create(i)))

  //for(i <- 10000 to 100000 by 10000) println(sa.measureTimeArray(SelectionSort, ShuffleArrayFactory.create(i)))
  //for(i <- 10000 to 100000 by 10000) println(sa.measureTimeArray(YSort, ShuffleArrayFactory.create(i)))

  //for (i <- factoryArray) println(sa.findMaxSizeUnderOneSecond(YSort, i).toString)
  for (i <- factoryArray) println(sa.findMaxSizeUnderOneSecond(SelectionSort, i).toString)
}
