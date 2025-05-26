import zio._
import zio.Console._

object Runner extends ZIOAppDefault {

  def run = appLogic

  val appLogic =
    for {
      _    <- printLine("Hello! What is your name?")
      name <- readLine
      _    <- printLine(s"Hello, ${name}, welcome to ZIO!")
    } yield ()
}