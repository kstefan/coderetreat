package cz.karelstefan.coderetreat

import spock.lang.Specification

class GameOfLifeSpec extends Specification {

    def "play method has not implementation yet"() {
        given:
            def game = new GameOfLife()
        when:
            game.play()
        then:
            thrown UnsupportedOperationException
    }
}
