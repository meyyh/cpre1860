#!/bin/bash
javac -cp chesslib.jar Main.java Led.java Convert.java ReadHall.java

java -cp .:chesslib.jar Main
