package com.example.scala.osgi.greeter.impl

import com.example.scala.osgi.greeter.Greeter

class SimpleGreeter extends Greeter {
  def greet(name: String): String = { "Hello " + name }
}
