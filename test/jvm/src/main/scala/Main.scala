import slogging._

object Main {

  def main(args: Array[String]) : Unit = {
    val tests = Seq(
      new LazyLoggingTest(NullLoggerFactory),
      new LazyLoggingTest(PrintLoggerFactory),
      new LazyLoggingTest(SLF4JLoggerFactory)
    )

    tests.foreach( _.run )
  }
}
