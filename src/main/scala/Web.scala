
import lol.http._
import net.liftweb.json.DefaultFormats

import scala.io._

import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._
//import play.api.libs.json._
import scala.concurrent.ExecutionContext.Implicits.global

import java.util.UUID.randomUUID


object Web {

  def main(args: Array[String]): Unit = {

    var filename = "sample-restaurant-data.json"
    Server.listen(4000) {

      case GET at url"/api/$restaurant" =>


        var file = Source.fromFile(filename).getLines().mkString
        var FilePars = parse(file)
        Ok(FilePars.toSeq.toString)

//      case request @ POST at url"/api/$restaurant" =>
//        request.readAs[Json].map { jsonBody =>
//          val id = randomUUID().toString
//
//          var res = """"
//
//          "uuid": "$id",
//          "data": {
//            "enName": "$restaurant",
//            "arName": "",
//            "state": "PUBLISHED",
//            "routingMethod": null,
//            "logo": "",
//            "coverPhoto": null,
//            "enDescription": "",
//            "arDescription": null,
//            "shortNumber": "",
//            "facebookLink": "",
//            "twitterLink": "",
//            "youtubeLink": "",
//            "website": null,
//            "onlinePayment":  ${jsonBody.\\("onlinePayment")},
//            "client":${jsonBody.\\("client")},,
//            "pendingInfo": ${jsonBody.\\("pendingInfo")},,
//            "pendingMenu": ${jsonBody.\\("pendingMenu")},,
//            "closed": ${jsonBody.\\("closed")},
//          }
//          """""
//
//          Ok(res.toSeq.toString())
//
//        }





      case GET at url"/api/restaurant?closed=0"  =>
        var file = Source.fromFile(filename).getLines().mkString
        var FilePars = parse(file)
        Ok(FilePars.toSeq.toString)
    }
    println("Listening on http://localhost:4000...")
  }

}
