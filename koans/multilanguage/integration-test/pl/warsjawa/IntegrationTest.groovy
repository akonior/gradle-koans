package pl.warsjawa

import spock.lang.*

class UnitSpec extends Specification {

  def "correct message in groovy class"() {
    expect:
    WarsGroovy.groovyMessage == "Message from WarsGroovy"
  }
}
