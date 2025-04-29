import java.io.PrintWriter
import scala.util.Random

object GenerateCSV extends App {
  val numberOfElements = 100000000 // Spécifie le nombre de nombres à générer
  val numbers = Seq.fill(numberOfElements)(Random.nextInt(100000)) // Génère des nombres aléatoires entre 0 et 99999

  val writer = new PrintWriter("100000k.csv")
  numbers.foreach(writer.println) // Écrit chaque nombre sur une nouvelle ligne
  writer.close()
}


