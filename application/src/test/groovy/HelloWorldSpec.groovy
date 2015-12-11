// For more examples:
// https://github.com/spockframework/spock-example/tree/master/src/test/groovy

class HelloSpockSpec extends spock.lang.Specification {
	def "length of Spock's and his friends' names"() {
		expect:
		name.size() == length

		where:
		name     | length
		"Spock"  | 5
		"Kirk"   | 4
		"Scotty" | 6
	}
}