grails.project.class.dir = 'target/classes'
grails.project.test.class.dir = 'target/test-classes'
grails.project.test.reports.dir	= 'target/test-reports'
grails.project.docs.output.dir = 'docs' // for the gh-pages branch

grails.project.dependency.resolution = {

	inherits('global') {
		excludes 'commons-codec' // Grails ships with 1.3, need 1.4
	}

	log 'warn'

	repositories {
        mavenLocal()
        mavenRepo "http://aggron:8081/artifactory/repo"
        mavenCentral()

		grailsPlugins()
		grailsHome()
		grailsCentral()

		ebr() // SpringSource  http://www.springsource.com/repository
	}

	dependencies {
        compile('org.hsqldb:hsqldb:2.0.0')

		runtime('org.springframework.security:spring-security-acl:3.1.0.RELEASE') {
			transitive = false
		}
	}
}
