name := "xmla"

version := "1.0"

scalaVersion := "2.11.5"

resolvers += "Pentaho Repo" at "http://repository.pentaho.org/artifactory/repo/"

libraryDependencies += "pentaho" % "mondrian" % "4.2.0.0-190"

libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"

libraryDependencies += "mysql" %  "mysql-connector-java" % "5.1.34"

tomcat()