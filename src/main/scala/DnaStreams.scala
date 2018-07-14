
/*
Task is to define a function which will return an infinite stream of "dna_codes" ordered by length, then alphabetically.
 */

object DnaStreams {
  val dna_elements = Seq('A', 'C', 'G', 'T')

  def dna_codes: Stream[String] =
    for {
      code <- "" #:: dna_codes
      element <- dna_elements
    } yield code + element

  def main(args: Array[String]): Unit = {
    dna_codes.take(25).foreach(println)
  }
}
