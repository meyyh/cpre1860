#!/bin/bash
javac -cp chesslib.jar Main.java Led.java Convert.java ReedSense.java

java -cp .:chesslib.jar Main
