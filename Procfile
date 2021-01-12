web: java -Dserver.port=$PORT $JAVA_OPTS -jar $PATH_TO_PROJECT/target/*.jar --spring.profiles.active=prod,heroku

<configuration>
  <processTypes>
     <web>java $JAVA_OPTS -cp target/classes:target/dependency/* Main</web>
  </processTypes>
</configuration>

<jdkVersion>1.8</jdkVersion>

<configVars>
  <MY_VAR>SomeValue</MY_VAR>
  <JAVA_OPTS>-Xss512k -XX:+UseCompressedOops</JAVA_OPTS>
</configVars>

<includes>
  <include>etc/readme.txt</include>
</includes>