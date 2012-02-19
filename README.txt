* Build (gradle 0.9+)
% gradle clean install

* Deploy to Karaf
karaf@root> install -s wrap:mvn:org.scala-lang/scala-library/2.9.1
karaf@root> install -s mvn:com.example/scala.osgi.greeter/1.0.0-SNAPSHOT
karaf@root> install -s mvn:com.example/scala.osgi.greeter.impl/1.0.0-SNAPSHOT
karaf@root> install -s mvn:com.example/scala.osgi.greeter.cmd/1.0.0-SNAPSHOT
