package org.wallerlab.dso;

import spock.lang.Specification
import org.wallerlab.dso.Main

class TestSpec extends Specification {

    def "atom domain model"() {
        expect:
        Main.main()
    }

}
