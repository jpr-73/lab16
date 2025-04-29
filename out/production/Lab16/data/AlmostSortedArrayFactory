import scala.collection.mutable.ArrayBuffer

trait ArrayFactory {
  def create(size: Int): Array[Int] = ???
}

object RandomArrayFactory extends ArrayFactory{
  override def create(size: Int): Array[Int] ={
    val a: Array[Int]= Array.ofDim(size)
    for(i <- a.indices){
      a(i) = (math.random() * size).toInt
    }
    return a
  }
}

object InvertedSortedArrayFactory extends ArrayFactory{
  override def create(size: Int): Array[Int] = {
    val a: Array[Int] = Array.range(size-1, -1, -1)
    a
  }
}

object ShuffleArrayFactory extends ArrayFactory{
  override def create(size: Int): Array[Int] = {
    val a: Array[Int] = Array.ofDim(size)
    var c = 0
    for(i <- a.indices){
      if(i % 2 == 0) {
        a(i) = c
        c += 1
      }
      else{
        a(i) = size-c
      }
    }
    a
  }
}

object AlmostSortedArrayFactory extends ArrayFactory{

  var c = 30
  override def create(size: Int): Array[Int] = {
    val b: Array[Int] = Array.fill(size)(-1)
    val lp: ArrayBuffer[Int] = ArrayBuffer.empty
    val ln: ArrayBuffer[Int] = ArrayBuffer.empty
    val used = ((c.toDouble / 100) * size).toInt
    for(i <- 1 to used){
      var randnum = (math.random() * (size-1)).toInt
      var randpos = (math.random() * (size-1)).toInt
      while(ln.contains(randnum)) randnum = (math.random() * (size-1)).toInt
      ln += randnum
      while(lp.contains(randpos)) randpos = (math.random() *( size-1)).toInt
      lp += randpos
      b(randpos) = randnum
    }
    var r = 0
    for(i <- b.indices){
      if(b(i) == -1){
        while(b.contains(r)){
          r += 1
        }
        b(i) = r
      }
    }
    b
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



class SortApplication{

  def readCsvFile(filename: String) : Array[Int] = {
    val bufferedSource = scala.io.Source.fromFile(filename)
    val num = bufferedSource
      .getLines()
      .flatMap(_.split("\\s+"))
      .map(_.trim.toInt)
      .toArray
    bufferedSource.close()
    num
  }
  def test1(str: String): Unit ={
    val a: Array[Int] = readCsvFile(str)
    val s = SelectionSort
    val startTime = System.nanoTime()
    s.sort(a)
    val endTime = System.nanoTime()
    val filename = str.split("/").last
    val size = filename.split("\\.").head

    println(s"for a file of size: $size the time of sorting is: ${(endTime - startTime) / 1e6} milliseconds")
  }

  def testYsort(str: String): Unit ={
    val a: Array[Int] = readCsvFile(str)
    val s = YSort
    val startTime = System.nanoTime()
    s.sort(a)
    val endTime = System.nanoTime()
    val filename = str.split("/").last
    val size = filename.split("\\.").head

    println(s"for a file of size: $size the time of sorting is: ${(endTime - startTime) / 1e6} milliseconds")
  }

  def displayArray(a: Array[Int]): Unit ={
    println(a.mkString(", "))
  }
}


object Task1 extends App{


  def test(size: Int): Unit = {

    val a = InvertedSortedArrayFactory
    val startTimeA = System.nanoTime()
    a.create(size)
    val endTimeA = System.nanoTime()
    val sizeStringA = if (size >= 1000) s"${size / 1000}k" else size.toString
    println(s"file size: $sizeStringA sorting time: ${(endTimeA - startTimeA) / 1e6} milliseconds for InvertedSortedArray")


    val b = RandomArrayFactory
    val startTimeB = System.nanoTime()
    b.create(size)
    val endTimeB = System.nanoTime()
    val sizeStringB = if (size >= 1000) s"${size / 1000}k" else size.toString
    println(s"file size: $sizeStringB sorting time: ${(endTimeB - startTimeB) / 1e6} milliseconds for RandomArray")


    val c = ShuffleArrayFactory
    val startTimeC = System.nanoTime()
    c.create(size)
    val endTimeC = System.nanoTime()
    val sizeStringC = if (size >= 1000) s"${size / 1000}k" else size.toString
    println(s"file size: $sizeStringC sorting time: ${(endTimeC - startTimeC) / 1e6} milliseconds for ShuffleArray")
  }


//  test(10000)
//  test(20000)
//  test(30000)
//  test(40000)
//  test(50000)
//  test(60000)
//  test(70000)
//  test(80000)
//  test(90000)
//  test(100000)



  val a = InvertedSortedArrayFactory
  a.create(10)

  val r = RandomArrayFactory
  r.create(10)

  val b = ShuffleArrayFactory
  b.create(10)


  val c = AlmostSortedArrayFactory
  c.create(10)


  val s = new SortApplication

//  s.test1("/Users/alex/IdeaProjects/Lab16/src/data/10k.csv")
//  s.test1("/Users/alex/IdeaProjects/Lab16/src/data/20k.csv")
//  s.test1("/Users/alex/IdeaProjects/Lab16/src/data/30k.csv")
//  s.test1("/Users/alex/IdeaProjects/Lab16/src/data/40k.csv")
//  s.test1("/Users/alex/IdeaProjects/Lab16/src/data/50k.csv")
//  s.test1("/Users/alex/IdeaProjects/Lab16/src/data/60k.csv")
//  s.test1("/Users/alex/IdeaProjects/Lab16/src/data/70k.csv")
//  s.test1("/Users/alex/IdeaProjects/Lab16/src/data/80k.csv")
//  s.test1("/Users/alex/IdeaProjects/Lab16/src/data/90k.csv")
//  s.test1("/Users/alex/IdeaProjects/Lab16/src/data/100k.csv")



  s.testYsort("/Users/alex/IdeaProjects/Lab16/src/data/10k.csv")
  s.testYsort("/Users/alex/IdeaProjects/Lab16/src/data/20k.csv")
  s.testYsort("/Users/alex/IdeaProjects/Lab16/src/data/30k.csv")
  s.testYsort("/Users/alex/IdeaProjects/Lab16/src/data/40k.csv")
  s.testYsort("/Users/alex/IdeaProjects/Lab16/src/data/50k.csv")
  s.testYsort("/Users/alex/IdeaProjects/Lab16/src/data/60k.csv")
  s.testYsort("/Users/alex/IdeaProjects/Lab16/src/data/70k.csv")
  s.testYsort("/Users/alex/IdeaProjects/Lab16/src/data/80k.csv")
  s.testYsort("/Users/alex/IdeaProjects/Lab16/src/data/90k.csv")
  s.testYsort("/Users/alex/IdeaProjects/Lab16/src/data/100k.csv")
  s.testYsort("/Users/alex/IdeaProjects/Lab16/10000k.csv")
  s.testYsort("/Users/alex/IdeaProjects/Lab16/100000k.csv")
//  s.displayArray(a.create(10))
//  s.displayArray(b.create(10))
//  s.displayArray(c.create(10))
//  s.displayArray(r.create(10))

  //Complexity of YSort is O(n)



}

