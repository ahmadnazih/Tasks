
import lol.http._

import scala.io._
import play.api.libs.json._


import scala.concurrent.ExecutionContext.Implicits.global


object Web {

  def main(args: Array[String]): Unit = {

   var filename = "sample-restaurant-data.json"
    var file = Source.fromFile(filename).getLines().mkString
   var FilePars = Json.parse(file)
   // var openRest = FilePars("data")("closed")
 // print(openRest)
  //  var jsonObj = Json.toJson(FilePars)

    Server.listen(4000) {

      case GET at url"/api/restaurant" =>
     Ok(FilePars.toString())

      case GET at url"/api/restaurant?closed=0"  =>
        Ok(FilePars.toString())
    }
    println("Listening on http://localhost:4000...")
  }

}
