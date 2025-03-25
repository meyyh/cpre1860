#!/bin/bash

/usr/lib/jvm/java-21-openjdk/bin/javac -cp "chesslib.jar:pi4j-core.jar" Main.java Led.java Convert.java ReedSense.java Gpio.java

/usr/lib/jvm/java-21-openjdk/bin/java -cp ".:chesslib.jar:pi4j-core.jar" Main

