import zio.{IO, ZIO}

object Primitives {

  val s1 = ZIO.succeed(42)

  val f1 = ZIO.fail("Uh oh!")

  val f2 = ZIO.fail(new Exception("Uh oh!"))

  val zoption: IO[Option[Nothing], Int] = ZIO.fromOption(Some(2))

  val zoption2: ZIO[Any, String, Int] = zoption.orElseFail("It wasn't there!")

  val zeither: ZIO[Any, Nothing, String] = ZIO.fromEither(Right("Success!"))
}
