Possible speed optimisations:

- DONE: enable `-Xverify:none` on the JVM arguments - TODO look into what it does, security implications
- DONE: enable `-XX:TieredStopAtLevel=1` on the JVM arguments - TODO look into what it does, security implications
- TODO: use [OpenJ9 JVM](https://www.eclipse.org/openj9/)
- TODO: use Undertow instead of Tomcat as the servlet container
- TODO: [enable only the autoconfigurations we need](https://stackoverflow.com/a/35994135)