name := """minimal-scala"""

version := "1.0"

scalaVersion := "2.11.1"

// Add Jmonkey resolver
//resolvers +="JMonkey Engine" at "http://updates.jmonkeyengine.org/maven/"

resolvers += "jme3" at "http://updates.jmonkeyengine.org/maven/"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.6" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.3"

libraryDependencies += "com.jme3" % "jme3-core" % "3.0.+"

libraryDependencies += "com.jme3" % "jme3-desktop" % "3.0.+"

libraryDependencies += "com.jme3" % "jme3-lwjgl" % "3.0.+"

libraryDependencies += "com.jme3" % "jme3-effects" % "3.0.+"

libraryDependencies += "com.jme3" % "jme3-networking" % "3.0.+"

libraryDependencies += "com.jme3" % "jme3-plugins" % "3.0.+"

libraryDependencies += "com.jme3" % "jme3-jogg" % "3.0.+"

libraryDependencies += "com.jme3" % "jme3-terrain" % "3.0.+"

libraryDependencies += "com.jme3" % "jme3-blender" % "3.0.+"

libraryDependencies += "com.jme3" % "jme3-jbullet" % "3.0.+"

libraryDependencies += "com.jme3" % "jme3-niftygui" % "3.0.+"

libraryDependencies += "net.sf.sociaal" % "jME3-testdata" % "3.0.0.20130526"