import zio._
import zio.Console._

object Runner extends ZIOAppDefault {
  import Primitives._

  def run = {
    appLogic
  }

  val appLogic =
    for {
      _    <- printLine("Hello! What is your name?")
      name <- readLine
      _    <- printLine(s"Hello, ${name}, welcome to ZIO!")
      res <- zoption2
    } yield ()



}