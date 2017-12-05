package poc.nats

import java.util.Properties

import io.nats.client._
import io.nats.client.MessageHandler

object NatsClientPOC {

  def main(args: Array[String]): Unit = {

    val props = new Properties

    val servers = Array("nats://nats1.polygon.io:30401",
      "nats://nats2.polygon.io:30402",
      "nats://nats3.polygon.io:30403").mkString(",")

    val opts = new Options.Builder()
                .noReconnect().token("faLO5SKoaIFzaG68_plwb_Uw7sJF8qDWdix0ik")
                .build();


    val conn:Connection =  Nats.connect(servers,opts)

    val mHandler = new io.nats.client.MessageHandler {

      override def onMessage(msg: Message): Unit = {

          println(s"${new String(msg.getData,"UTF-8")}")
      }
    }

    conn.subscribe("C.*",mHandler)



    }




}
