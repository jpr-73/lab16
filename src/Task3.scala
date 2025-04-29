
trait Sort{
  def sort(a: Array[Int]): Array[Int] = ???
}

object SelectionSort extends Sort{
  override def sort(a: Array[Int]): Array[Int] = {
    for(i <- a.indices){
      var minIndex = i
      for (j <- i +1 until a.length){
        if(a(j) < a(minIndex)) minIndex= j
      }
      val temp = a(minIndex)
      a(minIndex) = a(i)
      a(i) = temp
    }
    a
  }
}

object Task3 extends App{
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

  def test(str: String): Unit ={
    val a: Array[Int] = readCsvFile(str)
    val s = SelectionSort
    val startTime = System.nanoTime()
    s.sort(a)
    val endTime = System.nanoTime()
    val filename = str.split("/").last
    val size = filename.split("\\.").head

    println(s"for a file of size: $size the time of sorting is: ${(endTime - startTime) / 1e6} milliseconds")
  }

  test("/Users/alex/IdeaProjects/Lab16/src/data/10k.csv")
  test("/Users/alex/IdeaProjects/Lab16/src/data/20k.csv")
  test("/Users/alex/IdeaProjects/Lab16/src/data/30k.csv")
  test("/Users/alex/IdeaProjects/Lab16/src/data/40k.csv")
  test("/Users/alex/IdeaProjects/Lab16/src/data/50k.csv")
  test("/Users/alex/IdeaProjects/Lab16/src/data/60k.csv")
  test("/Users/alex/IdeaProjects/Lab16/src/data/70k.csv")
  test("/Users/alex/IdeaProjects/Lab16/src/data/80k.csv")
  test("/Users/alex/IdeaProjects/Lab16/src/data/90k.csv")
  test("/Users/alex/IdeaProjects/Lab16/src/data/100k.csv")
  //println(s.sort(a).mkString(","))
}
