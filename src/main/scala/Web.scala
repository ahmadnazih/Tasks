import lol.http._
import scala.concurrent.ExecutionContext.Implicits.global

object Web {

  def main(args: Array[String]): Unit = {
    Server.listen(4000) {

      case GET at url"/api/restaurant" =>
        Ok(ClasspathResource("/public/images/icon.gif"))
    }
    println("Listening on http://localhost:8888...")
  }

}
