package infra

import besom.*

object Main:
  def main(args: Array[String]): Unit =
    Pulumi.run:
      Stack(
        log.warn("Nothing's here yet, it's waiting for you to write some code!")
      )
