package com.example.scala.osgi.greeter.impl
import org.apache.karaf.shell.console.OsgiCommandSupport
import com.example.scala.osgi.greeter.Greeter

class GreeterCommand extends OsgiCommandSupport {
  var greeter: Greeter = null

  override
  def doExecute(): Object  = {
	  greeter greet "Fred"
  }
  
  def setGreeter(g:Greeter) = {
    greeter = g
  }
}
