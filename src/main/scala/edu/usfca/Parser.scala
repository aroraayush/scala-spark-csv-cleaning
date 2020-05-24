package edu.usfca

import scala.io.Source

class Parser {
	def someLibraryMethod(): Boolean = true

	def readFile(filePath : String): Unit ={
		val source : Source = Source.fromFile(filePath)
		for(line <- source.getLines()){
			println(line)
		}
		source.close()
	}

	def printFile() : Unit = {
		println("Ayush")
	}

}
