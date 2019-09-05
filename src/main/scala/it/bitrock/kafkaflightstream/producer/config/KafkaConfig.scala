package it.bitrock.kafkaflightstream.producer.config

import java.net.URI

final case class KafkaConfig(
    schemaRegistryUrl: URI,
    flightRawTopic: String,
    airportRawTopic: String,
    airlineRawTopic: String,
    cityRawTopic: String
)
