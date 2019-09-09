package it.bitrock.kafkaflightstream.producer.services

import akka.actor.Cancellable
import akka.stream.scaladsl.Source
import it.bitrock.kafkaflightstream.producer.model.Tick

import scala.concurrent.duration._

class TickSource(start: Int, interval: Int) {

  def source: Source[Tick, Cancellable] = Source.tick(start.seconds, interval.seconds, Tick())

}
