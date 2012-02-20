package com.example.scala.osgi.hello

import org.osgi.framework._

class Activator extends BundleActivator {
	def start( context: BundleContext ) {
		var bundleNames = context.getBundles()
			.map (b => b.getSymbolicName())
			.filter (b => b != context.getBundle())
		bundleNames.foreach(name => println("Bundle: " + name))
	}

	def stop( context: BundleContext ) {
		println("Stopping...")
	}
}
