package infra

import besom.*

object Main:
  @main def run = Pulumi.run:
    Stack(
      log.warn("Nothing's here yet, it's waiting for you to write some code!")
    )
