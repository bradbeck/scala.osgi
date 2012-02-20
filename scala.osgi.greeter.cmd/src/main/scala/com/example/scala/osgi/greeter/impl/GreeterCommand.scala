package com.example.scala.osgi.greeter.impl

import org.apache.felix.gogo.commands.Argument
import org.apache.felix.gogo.commands.Command
import org.apache.karaf.shell.console.OsgiCommandSupport
import com.example.scala.osgi.greeter.Greeter

@Command(scope = "greeter", name = "greet", description="Says hello")
class GreeterCommand extends OsgiCommandSupport {
  var greeter: Greeter = null

  @Argument(index = 0, name = "name", description = "the name to greet", required = true, multiValued = false)
  var name: String = null

  override
  def doExecute(): Object  = {
	  greeter greet name
  }
  
  def setGreeter(g: Greeter) = {
    greeter = g
  }
}
