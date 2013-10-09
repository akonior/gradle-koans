package pl.warsjawa

import spock.lang.*

class UnitTest extends Specification {

  def "correct message in java class"() {
    expect:
    WarsJava.javaMessage == "Message from Wars.java"
  }
}
